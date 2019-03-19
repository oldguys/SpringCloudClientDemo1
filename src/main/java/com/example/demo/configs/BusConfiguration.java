package com.example.demo.configs;

import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/3/19 0019.
 */
@Configuration
//@RemoteApplicationEventScan({"com.acme", "foo.bar"})
//@RemoteApplicationEventScan(basePackages = {"com.acme", "foo.bar", "fizz.buzz"})
//@RemoteApplicationEventScan(basePackageClasses = MyEvent.class)
public class BusConfiguration {
}
