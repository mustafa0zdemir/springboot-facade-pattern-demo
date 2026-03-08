package com.mustafaozdemir.service.impl;

import com.mustafaozdemir.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private static final Logger logger =
            LoggerFactory.getLogger(NotificationServiceImpl.class);

    @Override
    public void sendEmail(String email) {
        logger.info("Sending email to {}", email);
    }
}
