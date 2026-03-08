package com.mustafaozdemir.service.impl;

import com.mustafaozdemir.service.ShippingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {

    private static final Logger logger =
            LoggerFactory.getLogger(ShippingServiceImpl.class);

    @Override
    public void shipProduct(String productId) {
        logger.info("Shipping product {}", productId);
    }
}
