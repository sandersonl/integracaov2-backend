package com.integracaobackend.controllers;

import com.integracaobackend.models.CategoryModel;
import com.integracaobackend.services.CategoryService;
import com.integracaobackend.services.ICategoryService;

import java.util.List;

public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController() {
        categoryService = new CategoryService();
    }

    public List<CategoryModel> getAllCategory() {
        return categoryService.getCategoryList();
    }

    public List<CategoryModel> getCategoryByLineId(int id) {
        return categoryService.getCategoryByLineId(id);
    }

}
