package top.yangllong.springcloud.service;

import org.apache.ibatis.annotations.Param;
import top.yangllong.springcloud.entities.Payment;

/**
 * @Author: yangllong
 * @DATE: 2020/7/26 11:29
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
