package org.hisoka.demo.worker;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hinsteny
 * @Describtion
 * @date 2017/2/23
 * @copyright: 2016 All rights reserved.
 */
public class AppStart {

    private static ClassPathXmlApplicationContext context;

    private static final String configPath = "classpath*:spring-config.xml";

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext(new String[] { configPath });
        context.start();
    }
}
