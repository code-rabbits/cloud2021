package com.study.springcloud.service;

import com.study.springcloud.entity.Payment;

public interface PaymentService {

    Payment queryById(Long id);

    int insert(Payment payment);
}
