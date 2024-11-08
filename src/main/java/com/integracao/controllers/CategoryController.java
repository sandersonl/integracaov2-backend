package com.integracao.controllers;

import com.integracao.models.CategoryModel;
import com.integracao.services.ICategoryService;
import com.integracao.services.impl.TempCategoryService;

import java.util.List;

public class CategoryController {

    private ICategoryService categoryService;

    public CategoryController() {
        categoryService = new TempCategoryService();
    }

    public List<CategoryModel> getAllCategory() {
        return categoryService.getCategoryList();
    }

    public List<CategoryModel> getCategoryByLineId(int id) {
        return categoryService.getCategoryByLineId(id);
    }

}
