package com.study.springcloud.service.impl;

import com.study.springcloud.entity.Payment;
import com.study.springcloud.mapper.PaymentMapper;
import com.study.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public Payment queryById(Long id) {
        return paymentMapper.queryById(id);
    }

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }
}
