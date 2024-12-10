package com.example.progect.service.serviceImpl;
import com.example.progect.dto.CategoryDto;
import com.example.progect.mapper.CategoryMapper;
import com.example.progect.model.CategoryModel;
import com.example.progect.repo.CategoryRepo;
import com.example.progect.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryImpl implements CategoryService {
@Autowired
private CategoryRepo categoryRepo;



    @Override
    public List<CategoryDto> getAllCategories() {
        List<CategoryModel> categories = categoryRepo.findAll();
        return CategoryMapper.categoryMapper.categoryModelToCategoryDtoList(categories);
    }

    @Override
    public void saveCategory(CategoryDto categoryDto) {
        CategoryModel categoryModel = CategoryMapper.categoryMapper.categoryDtoToCategoryModel(categoryDto);
        categoryRepo.save(categoryModel);
    }
}
