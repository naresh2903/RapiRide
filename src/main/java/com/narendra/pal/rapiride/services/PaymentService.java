package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.entities.Payment;
import com.narendra.pal.rapiride.entities.Ride;
import com.narendra.pal.rapiride.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
