package com.ycz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器.默认是从这个类的当前位置向下级包自动扫描
 *
 * @author yuancz.
 * @version 2018/8/15 18:15
 */
@SpringBootApplication
public class WebApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationStarter.class, args);
    }
}
