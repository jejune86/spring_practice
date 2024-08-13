package com.example.starthere7.controller;

import com.example.starthere7.model.Payment;
import com.example.starthere7.model.PaymentDetails;
import com.example.starthere7.proxy.PaymentProxy;
import com.example.starthere7.proxy.PaymentsProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

//    private final PaymentProxy paymentProxy;
//
//    public PaymentsController(PaymentProxy paymentProxy) {
//        this.paymentProxy = paymentProxy;
//    }
//
//    @PostMapping("/payment")
//    public Payment CreatePayment(@RequestBody Payment payment) {
//        String requestId = UUID.randomUUID().toString();
//        return paymentProxy.createPayment(requestId, payment);
//    }

    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Mono<Payment> createPayment(@RequestBody Payment payment) {
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy.createPayment(requestId, payment);
    }

}
