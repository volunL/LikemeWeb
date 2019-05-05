package com.emotion.controller;

import com.emotion.cus.po.CusUser;
import com.emotion.cus.service.impl.CusUserServiceImpl;
import com.emotion.sys.ResponseObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;




/*
 * Created by liangzx on 2019-03-18
 * */

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private ResponseObject responseObject;

    @Autowired
    private CusUserServiceImpl cusUserService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest httpServletRequest) {
        String ip = httpServletRequest.getRemoteAddr();
        logger.info("请求IP为：[" + ip + "]");
        return "index";
    }








}
