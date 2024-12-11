package com.integracaobackend.controllers;

import com.integracaobackend.entity.Category;
import com.integracaobackend.repositories.CategoryRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> categories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category categoryById(@PathVariable(value = "id") int id) {
        return categoryRepository.findById(id);
    }

    @GetMapping("/categories/line/id/{id}")
    public List<Category> categoriesByLineId(@PathVariable int id) {
        return categoryRepository.findAll().stream().filter(category -> category.getLine().getId() == id).collect(Collectors.toList());
    }

    @GetMapping("/categories/line/{name}")
    public List<Category> categoriesByLineName(@PathVariable String name) {
        return categoryRepository.findAll().stream().filter(category -> category.getLine().getName().equals(name)).collect(Collectors.toList());
    }



}
