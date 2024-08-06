package com.example.starthere7.service;

import com.example.starthere7.exceptions.NotEnoughMoneyException;
import com.example.starthere7.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
