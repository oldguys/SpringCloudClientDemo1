package com.example.demo.configs;

import com.example.demo.dto.TestBean;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by Administrator on 2019/3/19 0019.
 */
@RefreshScope
@Configuration
public class RefreshConfiguration {

    @Bean
    public TestBean TestBean() {

        System.out.println();
        System.out.println("创建Bean:" + new Date());
        System.out.println();

        return new TestBean();
    }
}
