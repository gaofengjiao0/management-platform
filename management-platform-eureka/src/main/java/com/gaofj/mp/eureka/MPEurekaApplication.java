package com.gaofj.mp.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.eureka
 * @description MPEurekaApplication
 * @date 2019/12/27 13:40
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class MPEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MPEurekaApplication.class,args);
    }
}
