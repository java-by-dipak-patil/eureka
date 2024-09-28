package com.example.client.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/payment/provider/{price}")
    public String payNow(@PathVariable int price)
    {
        return "Payment with  "+price +"done successfully";
    }

}
