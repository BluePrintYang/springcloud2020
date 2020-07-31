package top.yangllong.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yangllong
 * @DATE: 2020/7/26 18:28
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//赋予负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
