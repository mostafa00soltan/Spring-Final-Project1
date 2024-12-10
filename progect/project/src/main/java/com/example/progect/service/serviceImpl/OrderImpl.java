package com.example.progect.service.serviceImpl;

import com.example.progect.dto.OrderDto;
import com.example.progect.mapper.OrderMapper;
import com.example.progect.model.OrderModel;
import com.example.progect.repo.OrderRepo;
import com.example.progect.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import java.util.List;

@Service
public class OrderImpl implements OrderService {
    @Autowired
    OrderRepo orderRepo;

    @Override
    public List<OrderDto> getOrdersByCategoryId(long catId) {
        List<OrderModel> orderModels = orderRepo.findByCategoryId(catId);
        return OrderMapper.orderMapper.ToOrderDtoList(orderModels);
    }

    @Override
    public List<OrderDto> getOrdersByKey(String Key) {
        List<OrderModel> orderModels = orderRepo.findOrderModelByNameOrDescriptionIgnoreCase(Key , Key);
        return OrderMapper.orderMapper.ToOrderDtoList(orderModels);
    }

    @Override
    public List<OrderDto> getOrdersByLetter(String letter) {
        List<OrderModel> orderModels = orderRepo.findOrderModelByNameContainingOrDescriptionContainsIgnoreCase(letter , letter);
        return OrderMapper.orderMapper.ToOrderDtoList(orderModels);
    }
}
