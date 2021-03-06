package io.nuls.event.bus.event.handler;

import io.nuls.core.event.BaseNulsEvent;
import io.nuls.event.bus.event.filter.NulsEventFilter;
import io.nuls.event.bus.event.filter.NulsEventFilterChain;
import io.nuls.event.bus.event.handler.intf.NulsEventHandler;

/**
 *
 * @author Niels
 * @date 2017/11/6
 *
 */
public abstract class AbstractNetworkNulsEventHandler<T extends BaseNulsEvent>  implements NulsEventHandler<T> {

    private NulsEventFilterChain filterChain = new NulsEventFilterChain();

    @Override
    public void addFilter(NulsEventFilter<T> filter) {
        filterChain.addFilter(filter);
    }

    @Override
    public NulsEventFilterChain getFilterChain() {
        return filterChain;
    }
}
