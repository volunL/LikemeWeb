package com.emotion.sys;

import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;


public class BaseService implements ServletContextAware {

    //静态常量 servlet上下文对象 避免空指针
    private static ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {

        this.servletContext = servletContext;

    }

    public Object getBean(Class clasz) {
            Object o = WebApplicationContextUtils.getWebApplicationContext(servletContext).getBean(clasz);
            return o;
    }
}
