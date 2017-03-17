package org.hisoka.demo.worker.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Hinsteny
 * @Describtion
 * @date 2017/2/23
 * @copyright: 2016 All rights reserved.
 */
public class MySimpleJob implements SimpleJob {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(ShardingContext context) {
        try {
            // TODO 业务逻辑
            logger.info("MySimpleJob jobName :{}, taskId: {}, param: {}", context.getJobName(), context.getTaskId(), context.getJobParameter());

        } catch (Exception e) {
            logger.error("Run job failed!", e);
        }
    }
}
