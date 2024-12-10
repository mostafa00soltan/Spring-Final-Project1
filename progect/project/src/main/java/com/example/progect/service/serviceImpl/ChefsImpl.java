package com.example.progect.service.serviceImpl;

import com.example.progect.dto.ChefsDto;
import com.example.progect.mapper.ChefsMapper;
import com.example.progect.model.ChefsModel;
import com.example.progect.repo.ChefsRepo;
import com.example.progect.service.ChefsService;
import com.example.progect.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefsImpl implements ChefsService {
@Autowired
private ChefsRepo chefsRepo;

    @Override
    public List<ChefsDto> getAllChefs() {
        List<ChefsModel>chefsModels = chefsRepo.findAll();
        return ChefsMapper.chefsMapper.chefsModelToChefsDtoList(chefsModels);
    }

    @Override
    public void saveChefs(ChefsDto chefsDto) {
        ChefsModel chefsModel = ChefsMapper.chefsMapper.chefsDtoToChefsModel(chefsDto);
        chefsRepo.save(chefsModel);
    }
}
