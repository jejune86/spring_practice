package com.example.starthere7.controller;

import com.example.starthere7.exceptions.NotEnoughMoneyException;
import com.example.starthere7.model.ErrorDetails;
import com.example.starthere7.model.PaymentDetails;
import com.example.starthere7.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {

        logger.info("Received payment " + paymentDetails.getAmount());

        return ResponseEntity.
                status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
