package com.example.progect.service;

import com.example.progect.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<OrderDto> getOrdersByCategoryId(long catId);
    List<OrderDto> getOrdersByKey(String Key);
    List<OrderDto> getOrdersByLetter(String letter);

}
