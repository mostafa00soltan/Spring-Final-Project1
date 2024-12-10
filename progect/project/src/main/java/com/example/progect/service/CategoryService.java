package com.example.progect.service;
import com.example.progect.dto.CategoryDto;
import com.example.progect.model.CategoryModel;


import java.util.List;

public interface CategoryService {


    List<CategoryDto> getAllCategories();
    void saveCategory(CategoryDto categoryDto);


}
