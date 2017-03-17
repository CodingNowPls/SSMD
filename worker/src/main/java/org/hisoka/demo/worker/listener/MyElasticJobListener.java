package org.hisoka.demo.worker.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Hinsteny
 * @Describtion
 * @date 2017/3/16
 * @copyright: 2016 All rights reserved.
 */
public class MyElasticJobListener implements ElasticJobListener {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        // do something ...
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        // do something ...
    }
}