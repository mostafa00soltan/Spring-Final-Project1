package com.example.progect.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class CategoryModel extends BaseEntity {

    private String flag;

    @OneToMany(mappedBy = "category")
    private List<OrderModel> order;

}
