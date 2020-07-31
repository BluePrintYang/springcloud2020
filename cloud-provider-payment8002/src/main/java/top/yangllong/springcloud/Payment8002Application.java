package top.yangllong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yangllong
 * @DATE: 2020/7/25 21:18
 */
@EnableEurekaClient
@SpringBootApplication
public class Payment8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002Application.class,args);
    }
}
