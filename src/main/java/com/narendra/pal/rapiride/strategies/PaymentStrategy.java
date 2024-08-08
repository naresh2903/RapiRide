package com.narendra.pal.rapiride.strategies;

import com.narendra.pal.rapiride.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}