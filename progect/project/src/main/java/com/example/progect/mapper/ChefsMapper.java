package com.example.progect.mapper;

import com.example.progect.dto.CategoryDto;
import com.example.progect.dto.ChefsDto;
import com.example.progect.model.CategoryModel;
import com.example.progect.model.ChefsModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChefsMapper {

    ChefsMapper chefsMapper= Mappers.getMapper(ChefsMapper.class);
    ChefsModel chefsDtoToChefsModel(ChefsDto chefsDto);
   ChefsDto chefsModelToChefsDto(ChefsModel chefsModel);

    List<ChefsDto> chefsModelToChefsDtoList(List<ChefsModel> chefsModelList);
    List<ChefsModel> chefsDtoListToChefsModelList(List<ChefsDto> chefsDtoList);


}
