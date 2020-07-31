package top.yangllong.springcloud.service.impl;

import org.springframework.stereotype.Service;
import top.yangllong.springcloud.dao.PaymentDao;
import top.yangllong.springcloud.entities.Payment;
import top.yangllong.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: yangllong
 * @DATE: 2020/7/26 11:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
