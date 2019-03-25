package com.example.demo.listeners;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2019/3/22 0022.
 */
@Component
public class TestRefreshListener
        implements ApplicationListener<RefreshRemoteApplicationEvent> {

    private ContextRefresher contextRefresher;

    @Override
    public void onApplicationEvent(RefreshRemoteApplicationEvent event) {
        System.out.println();
        System.out.println("TestRefreshListener。。。。。。。。。。。。");
        System.out.println();
    }
}