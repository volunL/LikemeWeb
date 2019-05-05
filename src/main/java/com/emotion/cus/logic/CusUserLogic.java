package com.emotion.cus.logic;

import com.emotion.cus.mapper.CusUserMapper;
import com.emotion.cus.po.CusUser;
import com.emotion.cus.po.CusUserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class CusUserLogic {

   private final Logger logger = LoggerFactory.getLogger(CusUserLogic.class);

    //spring bean加载用
    private CusUserMapper cusUserMapper;

    public CusUserMapper getCusUserMapper() {
        return cusUserMapper;
    }

    public void setCusUserMapper(CusUserMapper cusUserMapper) {
        this.cusUserMapper = cusUserMapper;
    }



    /*根据userid返回该用户全部信息*/
    public CusUser findCusUserByUserId(String userId){
        CusUser cusUser=cusUserMapper.selectByPrimaryKey(userId);
        logger.info("正在查询账号。。");
        return cusUser;
    }


    public List<CusUser> selectAllUser() {
        CusUserExample cusUserExample=new CusUserExample();
        List<CusUser> cusUser=cusUserMapper.selectByExample(cusUserExample);
        return cusUser;
    }
}
