package com.gaofj.mp.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.eureka
 * @description MPEurekaApplication
 * @date 2019/12/27 13:40
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gaofj.mp.sys.mapper")
public class MPSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(MPSysApplication.class,args);
    }
}
