package com.example.progect.mapper;

import com.example.progect.dto.OrderDto;
import com.example.progect.model.OrderModel;
import jakarta.persistence.criteria.Order;
import org.aspectj.weaver.ast.Or;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper orderMapper = Mappers.getMapper(OrderMapper.class);

    OrderModel toOrderModel(OrderDto orderDto);
    OrderDto toOrderDto(OrderModel orderModel);

    List<OrderModel>ToOrderModelList(List<OrderDto> orderDtoList);
    List<OrderDto> ToOrderDtoList(List<OrderModel> orderModelList);
}
