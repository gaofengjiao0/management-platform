package com.gaofj.mp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author gfj
 * @version v1.0
 * @package com.gaofj.mp.config
 * @description MPConfigApplication
 * @date 2019/12/27 12:03
 */
@SpringBootApplication
@EnableConfigServer
public class MPConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MPConfigApplication.class,args);
    }
}
