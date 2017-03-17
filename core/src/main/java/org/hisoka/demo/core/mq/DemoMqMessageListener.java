package org.hisoka.demo.core.mq;

import org.hisoka.core.mq.consumer.MqMessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * MQ客户端实例
 * @author Hinsteny
 * @date 2016/8/16
 * @copyright: 2016 All rights reserved.
 */
public class DemoMqMessageListener extends MqMessageListener {

    private static final Logger log = LoggerFactory.getLogger(DemoMqMessageListener.class);

	@Override
	public Object handleMessage(String messageId, String messageContent, String queue) {
        log.trace(messageContent);
		return "success";
	}

}
