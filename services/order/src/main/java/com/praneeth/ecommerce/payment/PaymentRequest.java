package com.praneeth.ecommerce.payment;

import com.praneeth.ecommerce.customer.CustomerResponse;
import com.praneeth.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
