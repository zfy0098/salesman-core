package com.rhjf.salesman.core.mq;


/**
 * @author zzg
 *
 * createtime:2017年6月26日
 *
 * description: MQ监听接口
 *
 */
public interface TestQueueListener {

    /**
     * 监听事件
     * @param message  消息对象
     */
    void listen();

}
