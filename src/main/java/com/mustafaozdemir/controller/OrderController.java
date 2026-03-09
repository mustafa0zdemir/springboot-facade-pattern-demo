package com.mustafaozdemir.controller;

import com.mustafaozdemir.dto.OrderRequestDTO;
import com.mustafaozdemir.dto.OrderResponseDTO;
import com.mustafaozdemir.facade.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderFacade orderFacade;

    @PostMapping
    public OrderResponseDTO placeOrder(@RequestBody OrderRequestDTO orderRequestDTO) {
        return orderFacade.placeOrder(orderRequestDTO);
    }



}
