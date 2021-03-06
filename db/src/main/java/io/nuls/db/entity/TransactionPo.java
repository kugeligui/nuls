package io.nuls.db.entity;

public class TransactionPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.hash
     *
     * @mbg.generated
     */
    private String hash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.create_time
     *
     * @mbg.generated
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.fee
     *
     * @mbg.generated
     */
    private Double fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.block_height
     *
     * @mbg.generated
     */
    private Integer blockHeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.block_hash
     *
     * @mbg.generated
     */
    private String blockHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.related_tx_hash
     *
     * @mbg.generated
     */
    private String relatedTxHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.txData
     *
     * @mbg.generated
     */
    private byte[] txdata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.sign
     *
     * @mbg.generated
     */
    private byte[] sign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction.extend
     *
     * @mbg.generated
     */
    private byte[] extend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.hash
     *
     * @return the value of transaction.hash
     *
     * @mbg.generated
     */
    public String getHash() {
        return hash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.hash
     *
     * @param hash the value for transaction.hash
     *
     * @mbg.generated
     */
    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.type
     *
     * @return the value of transaction.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.type
     *
     * @param type the value for transaction.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.remark
     *
     * @return the value of transaction.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.remark
     *
     * @param remark the value for transaction.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.create_time
     *
     * @return the value of transaction.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.create_time
     *
     * @param createTime the value for transaction.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.fee
     *
     * @return the value of transaction.fee
     *
     * @mbg.generated
     */
    public Double getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.fee
     *
     * @param fee the value for transaction.fee
     *
     * @mbg.generated
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.block_height
     *
     * @return the value of transaction.block_height
     *
     * @mbg.generated
     */
    public Integer getBlockHeight() {
        return blockHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.block_height
     *
     * @param blockHeight the value for transaction.block_height
     *
     * @mbg.generated
     */
    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.block_hash
     *
     * @return the value of transaction.block_hash
     *
     * @mbg.generated
     */
    public String getBlockHash() {
        return blockHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.block_hash
     *
     * @param blockHash the value for transaction.block_hash
     *
     * @mbg.generated
     */
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash == null ? null : blockHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.related_tx_hash
     *
     * @return the value of transaction.related_tx_hash
     *
     * @mbg.generated
     */
    public String getRelatedTxHash() {
        return relatedTxHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.related_tx_hash
     *
     * @param relatedTxHash the value for transaction.related_tx_hash
     *
     * @mbg.generated
     */
    public void setRelatedTxHash(String relatedTxHash) {
        this.relatedTxHash = relatedTxHash == null ? null : relatedTxHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.version
     *
     * @return the value of transaction.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.version
     *
     * @param version the value for transaction.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.txData
     *
     * @return the value of transaction.txData
     *
     * @mbg.generated
     */
    public byte[] getTxdata() {
        return txdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.txData
     *
     * @param txdata the value for transaction.txData
     *
     * @mbg.generated
     */
    public void setTxdata(byte[] txdata) {
        this.txdata = txdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.sign
     *
     * @return the value of transaction.sign
     *
     * @mbg.generated
     */
    public byte[] getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.sign
     *
     * @param sign the value for transaction.sign
     *
     * @mbg.generated
     */
    public void setSign(byte[] sign) {
        this.sign = sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction.extend
     *
     * @return the value of transaction.extend
     *
     * @mbg.generated
     */
    public byte[] getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction.extend
     *
     * @param extend the value for transaction.extend
     *
     * @mbg.generated
     */
    public void setExtend(byte[] extend) {
        this.extend = extend;
    }
}