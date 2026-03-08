package com.mustafaozdemir.service.impl;

import com.mustafaozdemir.service.InventoryService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class InventoryServiceImpl implements InventoryService {

    private static final Logger logger =
            LoggerFactory.getLogger(InventoryServiceImpl.class);

    @Override
    public void checkStock(String productId, int quantity) {
        logger.info("Checking stock for product {}", productId);
        if (quantity > 10) {
            throw new StockException("Not enough stock");
        }

        logger.info("Stock available");
    }

}

