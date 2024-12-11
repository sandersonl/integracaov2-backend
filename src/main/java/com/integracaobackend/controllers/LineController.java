package com.integracaobackend.controllers;

import com.integracaobackend.entity.Line;
import com.integracaobackend.repositories.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LineController {

    @Autowired
    LineRepository lineRepository;

    @GetMapping("/lines")
    public List<Line> lines() {
        return lineRepository.findAll();
    }

    @RequestMapping("/line/{id}")
    public Line lineById(@PathVariable(value = "id") int id) {
        return lineRepository.findById(id);
    }

}
