package com.emotion.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;


public class ApplicationStart extends ContextLoaderListener {


    private final Logger logger = LoggerFactory.getLogger(ApplicationStart.class);
    @Override
    public void contextInitialized(ServletContextEvent event) {

        logger.info("程序启动中");
        super.contextInitialized(event);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {

        logger.info("程序销毁关闭");
        super.contextDestroyed(event);

    }
}
