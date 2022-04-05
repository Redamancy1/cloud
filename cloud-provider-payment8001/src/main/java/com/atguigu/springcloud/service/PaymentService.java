package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Redamancy
 */
public interface PaymentService {
    /**
     *
     * @param payment
     * @return
     */
    public int create(Payment payment);
    public  Payment getPaymentById(@Param("id") Long id);
}
