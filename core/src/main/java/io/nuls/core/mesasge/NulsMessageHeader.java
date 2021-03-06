package io.nuls.core.mesasge;

import io.nuls.core.utils.crypto.Hex;
import io.nuls.core.utils.crypto.Utils;
import io.nuls.core.utils.io.NulsByteBuffer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class NulsMessageHeader implements Serializable {

    public static final int MESSAGE_HEADER_SIZE = 20;

    private int magicNumber;

    // the NulsMessage length
    private int length;

    //0x01 : networkMessage  //0x02 : eventMessage;
    private short headType;
    public static final short NETWORK_MESSAGE = 1;
    public static final short EVENT_MESSAGE = 2;

    private byte xor;

    //the extend length
    public static final int EXTEND_LENGTH = 9;
    private byte[] extend;

    public NulsMessageHeader() {
        this.magicNumber = 0;
        this.length = 0;
        this.headType = 0;
        this.xor = Hex.decode("00")[0];
        this.extend = new byte[9];
    }

    public NulsMessageHeader(int magicNumber, short headType) {
        this();
        this.magicNumber = magicNumber;
        this.headType = headType;
    }

    public NulsMessageHeader(int magicNumber, short headType, byte[] extend) {
        this(magicNumber,headType);
        this.extend = extend;
    }

    public NulsMessageHeader(int magicNumber, short headType, int length, byte xor) {
        this(magicNumber,headType);
        this.length = length;
        this.xor = xor;
    }

    public NulsMessageHeader(int magicNumber, short headType, int length, byte xor, byte[] extend) {
        this(magicNumber,headType,length,xor);
        this.extend = extend;
    }

    public int size() {
        return MESSAGE_HEADER_SIZE;
    }

    public byte[] serialize(){
        byte[] header = new byte[20];
        Utils.int32ToByteArrayLE(magicNumber,header,0);
        Utils.int32ToByteArrayLE(length,header,4);
        Utils.uint16ToByteArrayLE(headType,header,4);
        header[8] = xor;
        System.arraycopy(extend,0,header,11,9);
        return header;
    }

    public void serializeToStream(OutputStream stream) throws IOException {
        stream.write(serialize());
    }

    public void parse(NulsByteBuffer byteBuffer) {
        this.magicNumber = byteBuffer.readInt32LE();
        this.length = byteBuffer.readInt32LE();
        this.headType = byteBuffer.readShort();
        this.xor = byteBuffer.readByte();
        this.extend = byteBuffer.readBytes(EXTEND_LENGTH);
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public byte[] getExtend() {
        return extend;
    }

    public void setExtend(byte[] extend) {
        this.extend = extend;
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    public short getHeadType() {
        return headType;
    }

    public void setHeadType(short headType) {
        this.headType = headType;
    }

    @Override
    public String toString() {
        return Hex.encode(serialize());
    }

    public byte getXor() {
        return xor;
    }

    public void setXor(byte xor) {
        this.xor = xor;
    }
}
