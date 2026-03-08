package com.mustafaozdemir.service.impl;

import com.mustafaozdemir.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentServiceImpl.class);

    @Override
    public void processPayment(double amount) {

        logger.info("Processing payment {}", amount);

        if (amount <= 0) {
            throw new PaymentException("Invalid payment amount");
        }

        logger.info("Payment successful");
    }
}
