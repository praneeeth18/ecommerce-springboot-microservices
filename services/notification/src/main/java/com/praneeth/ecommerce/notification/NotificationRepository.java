package com.praneeth.ecommerce.notification;

import com.praneeth.ecommerce.kafka.payment.PaymentConfirmation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<PaymentConfirmation, String> {
}
