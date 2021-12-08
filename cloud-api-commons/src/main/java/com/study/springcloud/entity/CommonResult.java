package com.study.springcloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回格式
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {

    private Integer code;

    private String message;

    private Object data;


    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
