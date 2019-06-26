package com.sk.sample.mssp.payment.domain.service;

import com.sk.sample.mssp.payment.domain.model.Payment;

public interface PaymentService {
	Payment pay(Payment payment);
}
