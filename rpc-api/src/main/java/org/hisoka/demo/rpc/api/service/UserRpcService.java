package org.hisoka.demo.rpc.api.service;

import org.hisoka.demo.rpc.api.domain.User;

public interface UserRpcService {

	User findUser(String username);

}
