package com.example.progect.controller;

import com.example.progect.dto.ChefsDto;
import com.example.progect.service.ChefsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chefs")
public class ChefsController {
    @Autowired
    private ChefsService chefsService;

    @GetMapping("/getAllChefs")
    ResponseEntity<List<ChefsDto>> getAllChefs() {
        return ResponseEntity.ok(chefsService.getAllChefs());
    }

    @PostMapping("/saveChefs")
    ResponseEntity<ChefsDto> saveChefs(@Validated @RequestBody ChefsDto chefsDto) {
        chefsService.saveChefs(chefsDto);
        return ResponseEntity.ok(chefsDto);
    }
}
