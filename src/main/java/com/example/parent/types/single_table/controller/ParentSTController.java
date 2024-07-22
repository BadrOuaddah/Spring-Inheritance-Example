package com.example.parent.types.single_table.controller;

import com.example.parent.types.single_table.entity.Father;
import com.example.parent.types.single_table.repository.FatherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parents_single_table")
@Slf4j
public class ParentSTController {
    private final FatherRepository fatherRepository;

    public ParentSTController(FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    @GetMapping
    public List<Father> getAll() {
        return fatherRepository.findAll();
    }
}
