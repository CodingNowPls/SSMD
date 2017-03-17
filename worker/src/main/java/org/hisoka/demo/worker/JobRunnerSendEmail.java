package org.hisoka.demo.worker;

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
public class JobRunnerSendEmail implements SimpleJob {

    private static final Logger logger = LoggerFactory.getLogger(JobRunnerSendEmail.class);

    @Override
    public void execute(ShardingContext context) {
        try {
            // TODO 业务逻辑
            logger.info("我要执行 jobName :{}, taskId: {}, param: {}", context.getJobName(), context.getTaskId(), context.getJobParameter());

        } catch (Exception e) {
            logger.info("Run job failed!", e);
        }
    }
}
