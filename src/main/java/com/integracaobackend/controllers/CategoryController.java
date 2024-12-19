package com.integracaobackend.controllers;

import com.integracaobackend.entity.Category;
import com.integracaobackend.repositories.ICategoryRepository;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Categorias")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private ICategoryRepository ICategoryRepository;

    @GetMapping("/categories")
    @ApiOperation(value = "Retorna uma lista de categorias")
    public List<Category> listCategory() {
        return ICategoryRepository.findAll();
    }

    @GetMapping("/category/{id}")
    @ApiOperation(value = "Retorna uma categoria com o ID solicitado")
    public Category categoryById(@PathVariable(value = "id") int id) {
        return ICategoryRepository.findById(id);
    }

    @PostMapping("/category")
    @ApiOperation(value = "Salva uma categoria")
    public Category saveCategory(@RequestBody Category category) {
        return ICategoryRepository.save(category);
    }

    @DeleteMapping("/category")
    @ApiOperation(value = "Deleta uma categoria")
    public void deleteCategory(@RequestBody Category category) {
        ICategoryRepository.delete(category);
    }

    @PutMapping("/category")
    @ApiOperation(value = "Atualiza uma categoria")
    public Category updateCategory(@RequestBody Category category) {
        return ICategoryRepository.save(category);
    }

}
