package com.sk.sample.mssp.payment.application.sp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.sample.mssp.payment.domain.model.Payment;
import com.sk.sample.mssp.payment.domain.service.PaymentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/payments")
public class PaymentRestController implements PaymentService {
	@Autowired
	private PaymentService paymentService;
	
	@Override
	@PostMapping
	@ApiOperation(value="결제 요청")
	public Payment pay(@RequestBody Payment purchase) {
		return paymentService.pay(purchase);
	}

}
