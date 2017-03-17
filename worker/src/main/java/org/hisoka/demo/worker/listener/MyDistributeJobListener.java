package org.hisoka.demo.worker.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.AbstractDistributeOnceElasticJobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Hinsteny
 * @Describtion
 * @date 2017/3/17
 * @copyright: 2016 All rights reserved.
 */
public class MyDistributeJobListener extends AbstractDistributeOnceElasticJobListener {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public MyDistributeJobListener(long startedTimeoutMilliseconds, long completedTimeoutMilliseconds) {
        super(startedTimeoutMilliseconds, completedTimeoutMilliseconds);
    }

    @Override
    public void doBeforeJobExecutedAtLastStarted(ShardingContexts shardingContexts) {
        logger.info("beforeJobExecuted: {}", shardingContexts.getJobName());
    }

    @Override
    public void doAfterJobExecutedAtLastCompleted(ShardingContexts shardingContexts) {
        logger.info("beforeJobExecuted: {}", shardingContexts.getJobName());
    }

}
