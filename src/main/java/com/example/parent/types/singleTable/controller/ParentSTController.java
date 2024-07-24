package com.example.parent.types.singleTable.controller;

import com.example.parent.types.singleTable.entity.Father;
import com.example.parent.types.singleTable.repository.FatherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fathers_single_table")
@Slf4j
public class ParentSTController {
    private final FatherRepository fatherRepository;

    public ParentSTController(FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    @GetMapping
    public List<Father> getAllFather() {
        return fatherRepository.findAll();
    }

    @GetMapping(path = "/{fatherId}")
    public ResponseEntity<Father> findFatherById(@PathVariable Long fatherId) {
        Optional<Father> fatherOptional = fatherRepository.findById(fatherId);
        return fatherOptional
                .map(father -> ResponseEntity.ok().body(father))
                .orElse(ResponseEntity.notFound().build());
    }

}
