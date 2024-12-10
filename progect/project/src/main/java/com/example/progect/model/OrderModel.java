package com.example.progect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class OrderModel extends BaseEntity {

    private String description;
    private double price;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
}
