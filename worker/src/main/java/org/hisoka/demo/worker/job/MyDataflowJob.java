package org.hisoka.demo.worker.job;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robert HG (254963746@qq.com) on 4/17/16.
 */
public class MyDataflowJob implements DataflowJob<String> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<String> fetchData(ShardingContext context) {
        // TODO 业务逻辑
        logger.info("MyDataflowJob.fetchData jobName :{}, taskId: {}, param: {}", context.getJobName(), context.getTaskId(), context.getJobParameter());
        List<String> data = new ArrayList();
        data.add("Hinsteny");
        data.add("Hisoka");
        return data;
    }

    @Override
    public void processData(ShardingContext context, List<String> data) {
        try {
            // TODO 业务逻辑
            logger.info("MyDataflowJob.processData jobName :{}, taskId: {}, param: {}", context.getJobName(), context.getTaskId(), context.getJobParameter());
            logger.info("MyDataflowJob.processData jobName :{}, taskId: {}, data: {}",  context.getJobName(), context.getTaskId(), data.toString());
        } catch (Exception e) {
            logger.error("Run job failed!", e);
        }
    }


}
