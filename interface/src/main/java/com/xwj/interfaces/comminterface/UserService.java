package com.xwj.interfaces.comminterface;

import com.xwj.interfaces.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
