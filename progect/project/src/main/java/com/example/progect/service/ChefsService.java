package com.example.progect.service;

import com.example.progect.dto.ChefsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChefsService {
    List<ChefsDto>getAllChefs();

    void saveChefs(ChefsDto chefsDto);
}
