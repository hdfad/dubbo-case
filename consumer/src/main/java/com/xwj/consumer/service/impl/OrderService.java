package com.xwj.consumer.service.impl;

import com.xwj.interfaces.bean.UserAddress;
import com.xwj.interfaces.comminterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

	@Autowired
	UserService userService;
	
	/**
	 * 初始化订单，查询用户的所有地址并返回
	 * @return
	 */
	public List<UserAddress> initOrder(){
		return userService.getUserAddressList("1");
	}

}
