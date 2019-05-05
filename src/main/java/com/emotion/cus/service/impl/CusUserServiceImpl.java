package com.emotion.cus.service.impl;

import com.emotion.cus.logic.CusUserLogic;
import com.emotion.cus.po.CusUser;
import com.emotion.cus.service.CusUserService;
import com.emotion.sys.BaseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
public class CusUserServiceImpl extends BaseService implements CusUserService {

    private final Logger logger = LoggerFactory.getLogger(CusUserServiceImpl.class);

    public CusUser findCusUserByUserId(String userId) {
        CusUserLogic cusUserLogic = (CusUserLogic) super.getBean(CusUserLogic.class);
        CusUser cusUser = cusUserLogic.findCusUserByUserId(userId);
        logger.info("正在查询 查询ID为：[" + userId + "]");
        return cusUser;
    }

    @Override
    public List<CusUser> queryAllUser() {
        CusUserLogic cusUserLogic = (CusUserLogic) super.getBean(CusUserLogic.class);
        List<CusUser> cusUser = cusUserLogic.selectAllUser();
        logger.info("正在查询");
        return cusUser;
    }
}
