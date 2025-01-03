package com.integracaobackend.controllers;

import com.integracaobackend.entity.Category;
import com.integracaobackend.services.impl.CategoryService;
import com.integracaobackend.services.ICategoryService;

import java.util.List;

public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController() {
        categoryService = new CategoryService();
    }

    public List<Category> getAllCategory() {
        return categoryService.getCategoryList();
    }

    public List<Category> getCategoryByLineId(int id) {
        return categoryService.getCategoryByLineId(id);
    }

}
