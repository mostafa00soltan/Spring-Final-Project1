package com.example.progect.controller;

import com.example.progect.dto.OrderDto;
import com.example.progect.model.OrderModel;
import com.example.progect.service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrderByCategoryId")
    List<OrderDto> getOrderByCategoryId(@RequestParam long catId) {
        return orderService.getOrdersByCategoryId(catId) ;
    }


    @GetMapping("/getOrderByKey")
    List<OrderDto> getOrderByKey(@RequestParam String Key) {
        return orderService.getOrdersByKey(Key) ;
    }

    @GetMapping("/getOrderByLetter")
    List<OrderDto> getOrderByLetter(@RequestParam String Letter) {
        return orderService.getOrdersByLetter(Letter) ;
    }
}
