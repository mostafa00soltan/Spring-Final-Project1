package com.example.progect.mapper;

import com.example.progect.dto.CategoryDto;
import com.example.progect.model.CategoryModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper categoryMapper= Mappers.getMapper(CategoryMapper.class);
    CategoryModel categoryDtoToCategoryModel(CategoryDto categoryDto);
    CategoryDto categoryModelToCategoryDto(CategoryModel categoryModel);

    List<CategoryDto> categoryModelToCategoryDtoList(List<CategoryModel> categoryModelList);
    List<CategoryModel> categoryDtoListToCategoryModelList(List<CategoryDto> categoryDtoList);


}
