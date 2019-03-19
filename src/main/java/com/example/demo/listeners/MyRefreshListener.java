package com.example.demo.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.*;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/3/19 0019.
 */
@Component
public class MyRefreshListener extends RefreshListener {

    @Autowired
    private Environment env;

    public MyRefreshListener(ContextRefresher contextRefresher) {
        super(contextRefresher);
    }

    @Override
    public void onApplicationEvent(RefreshRemoteApplicationEvent event) {
        super.onApplicationEvent(event);

        System.out.println();
        System.out.println("foo:/t" + env.getProperty("foo"));
        System.out.println("foo1:/t" + env.getProperty("foo1"));
        System.out.println();
    }
}
