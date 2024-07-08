package com.praneeth.ecommerce.kafka;

import com.praneeth.ecommerce.customer.CustomerResponse;
import com.praneeth.ecommerce.order.PaymentMethod;
import com.praneeth.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(

        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
