package com.mustafaozdemir.facade;


import com.mustafaozdemir.dto.OrderRequestDTO;
import com.mustafaozdemir.dto.OrderResponseDTO;
import com.mustafaozdemir.service.InventoryService;
import com.mustafaozdemir.service.NotificationService;
import com.mustafaozdemir.service.PaymentService;
import com.mustafaozdemir.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private ShippingService shippingService;

    @Autowired
    private NotificationService notificationService;

    public OrderResponseDTO placeOrder(OrderRequestDTO request) {

        inventoryService.checkStock(request.getProductId(), request.getQuantity());

        paymentService.processPayment(request.getAmount());

        shippingService.shipProduct(request.getProductId());

        notificationService.sendEmail(request.getEmail());

        return new OrderResponseDTO("Order successfully created");
    }
}