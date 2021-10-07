package com.xwj.provider.service.impl;

import com.xwj.interfaces.bean.UserAddress;
import com.xwj.interfaces.comminterface.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
		
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
//		return userAddressDao.getUserAddressById(userId);
		List<UserAddress> userAddresses=new ArrayList<>();
		UserAddress userAddress=new UserAddress();
		userAddress.setId(1);
		userAddress.setUserAddress("四川成都");
		userAddresses.add(userAddress);
		return userAddresses;
	}

}
