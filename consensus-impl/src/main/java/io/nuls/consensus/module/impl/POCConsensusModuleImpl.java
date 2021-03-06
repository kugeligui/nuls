package io.nuls.consensus.module.impl;

import io.nuls.consensus.constant.POCConsensusConstant;
import io.nuls.consensus.event.JoinConsensusEvent;
import io.nuls.consensus.handler.JoinConsensusHandler;
import io.nuls.consensus.module.AbstractConsensusModule;
import io.nuls.consensus.service.impl.POCConsensusServiceImpl;
import io.nuls.core.context.NulsContext;
import io.nuls.core.utils.log.Log;
import io.nuls.event.bus.processor.service.intf.NetworkProcessorService;

/**
 *
 * @author Niels
 * @date 2017/11/7
 *
 */
//todo
public class POCConsensusModuleImpl extends AbstractConsensusModule {

    private NetworkProcessorService processorService = NulsContext.getInstance().getService(NetworkProcessorService.class);

    @Override
    public void start() {
        this.checkGenesisBlock();
        this.checkBlockHeight();
        this.checkConsensusStatus();
        this.startBlockMaintenanceThread();
        this.registerHanders();
        this.registerService(POCConsensusServiceImpl.getInstance());
        Log.info("the POC consensus module is started!");
    }

    private void registerHanders() {
        //todo
        JoinConsensusHandler joinConsensusHandler = new JoinConsensusHandler();
        //add filter , add validator
        processorService.registerEventHandler(JoinConsensusEvent.class,joinConsensusHandler);
    }

    private void checkConsensusStatus() {
        //todo
    }

    private void checkBlockHeight() {
        //todo
    }

    private void startBlockMaintenanceThread() {
        //todo
    }


    /**
     * check genesis block
     * if genesis block isn't exist,create and download
     * exist: Verify it .
     */
    private void checkGenesisBlock() {
        //todo
    }
    @Override
    public void shutdown() {
        //todo

    }

    @Override
    public void destroy() {
        //todo
    }

    @Override
    public String getInfo() {
        //todo 加入共识时间、出块数量、收益金额。。。
        return null;
    }

    @Override
    public int getVersion() {
        return POCConsensusConstant.POC_CONSENSUS_MODULE_VERSION;
    }
}
