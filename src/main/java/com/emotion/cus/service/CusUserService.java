package com.emotion.cus.service;

import com.emotion.cus.po.CusUser;

import java.util.List;

public interface CusUserService {
    CusUser findCusUserByUserId(String userId);

    List<CusUser> queryAllUser();
}
