package com.example.progect.controller;

import com.example.progect.dto.CategoryDto;
import com.example.progect.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/getAllCategory")
    ResponseEntity<List<CategoryDto>> getAllCategory() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }


    @PostMapping("/saveCategory")
    ResponseEntity<CategoryDto> saveCategory(@Validated @RequestBody CategoryDto categoryDto) {
        categoryService.saveCategory(categoryDto);
        return ResponseEntity.ok(categoryDto);
    }




}
