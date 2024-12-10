package com.example.progect.repo;

import com.example.progect.model.OrderModel;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<OrderModel, Long> {

    List <OrderModel> findByCategoryId(long catId);

    List<OrderModel> findOrderModelByNameOrDescriptionIgnoreCase(String key, String description);


    List<OrderModel>   findOrderModelByNameContainingOrDescriptionContainsIgnoreCase (String key, String description);

}
