package top.yangllong.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.yangllong.springcloud.entities.Payment;

/**
 * @Author: yangllong
 * @DATE: 2020/7/25 21:45
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
