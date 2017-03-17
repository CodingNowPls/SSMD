package org.hisoka.demo.rpc.service;

import org.springframework.stereotype.Service;
import org.hisoka.demo.rpc.api.service.DemoRpcService;


/**
 * @author Hinsteny
 * @date 2016/8/16
 * @copyright: 2016 All rights reserved.
 */
@Service("demoRpcServiceImpl")
public class DemoRpcServiceImpl implements DemoRpcService {

	@Override
	public String sayHello() {
		System.out.println("demo rpc hello");
		return "demo rpc hello";
	}

	@Override
	public String say(String s) {
		System.out.println(s);
		return s;
	}
}
