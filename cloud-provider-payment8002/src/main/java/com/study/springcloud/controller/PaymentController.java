package com.study.springcloud.controller;

import com.study.springcloud.entity.CommonResult;
import com.study.springcloud.entity.Payment;
import com.study.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment){

        int result = paymentService.insert(payment);
        log.info("插入结果"+result);

        if (result>0){
            return new CommonResult(200,"插入成功,,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }


    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.queryById(id);
        log.info("查询结果"+payment);

        if (payment!=null){
            return new CommonResult(200,"查询成功,,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败",null);
        }
    }



}
