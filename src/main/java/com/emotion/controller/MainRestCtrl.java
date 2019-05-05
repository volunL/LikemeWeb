package com.emotion.controller;


import com.emotion.cus.po.CusUser;
import com.emotion.cus.service.impl.CusUserServiceImpl;
import com.emotion.sys.ResponseObject;
import com.emotion.sys.config.STATUS;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(tags = "用户模块")
@RestController
public class MainRestCtrl {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private ResponseObject responseObject;

    @Autowired
    private CusUserServiceImpl cusUserService;

    @ApiOperation(value = "根据账号查询单个用户信息",httpMethod = "GET")
    @RequestMapping(value = "/queryuser", method = RequestMethod.GET)
    public ResponseObject QueryUser(HttpServletRequest httpServletRequest, @RequestParam("userid") String userid) {
        String ip = httpServletRequest.getRemoteAddr();
        try {
            CusUser cusUser = cusUserService.findCusUserByUserId(userid);
            logger.info("[请求成功]请求IP为:[" + ip + "]" + "请求参数:{userid:" + userid + "}");
            responseObject.setObject(cusUser);
            if (cusUser == null) {
                responseObject.setStatus(STATUS.WARN);
            } else {
                responseObject.setStatus(STATUS.OK);
            }
            responseObject.setMsg("请求成功");
            return responseObject;
        } catch (Exception e) {
            logger.error("[请求失败]请求IP为:[" + ip + "]" + "请求参数:{userid:" + userid + "}");
            logger.error("失败原因:{" + e.toString() + "}");
            responseObject.setObject(null);
            responseObject.setStatus(STATUS.ERROR);
            responseObject.setMsg("请求失败，服务异常");
            return responseObject;
        }
    }

    @ApiOperation(value = "返回全部用户",httpMethod = "GET")
    @RequestMapping(value = "/queryalluser", method = RequestMethod.GET)
    public ResponseObject QueryAllUser(HttpServletRequest httpServletRequest) {
        String ip = httpServletRequest.getRemoteAddr();
        try {
            List<CusUser> cusUser = cusUserService.queryAllUser();
            logger.info("[请求成功]请求IP为:[" + ip + "]");
            responseObject.setObject(cusUser);
            if (cusUser == null) {
                responseObject.setStatus(STATUS.WARN);
            } else {
                responseObject.setStatus(STATUS.OK);
            }
            responseObject.setMsg("请求成功");
            return responseObject;
        } catch (Exception e) {
            logger.error("[请求失败]请求IP为:[" + ip + "]");
            logger.error("失败原因:{" + e.toString() + "}");
            responseObject.setObject(null);
            responseObject.setStatus(STATUS.ERROR);
            responseObject.setMsg("请求失败，服务异常");
            return responseObject;
        }
    }
}
