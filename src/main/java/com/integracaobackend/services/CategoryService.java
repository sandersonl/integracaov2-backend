package com.integracaobackend.services;

import com.integracaobackend.entity.Category;
import com.integracaobackend.models.CategoryModel;
import com.integracaobackend.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryService implements ICategoryService {

    private final List<Category> categories = null;

    private final List<CategoryModel> categoryList = categories.stream().map(
            category -> {
                return new CategoryModel(category.getId(), category.getLine().getId(), category.getName(), category.getLine().getName());
            }).collect(Collectors.toList());

    public CategoryService() {
    }

    @Override
    public List<CategoryModel> getCategoryList() {
        return categoryList;
    }

    @Override
    public List<CategoryModel> getCategoryByLineId(int id) {
        return categoryList.stream().filter(categoryModel -> categoryModel.getLineId() == id).collect(Collectors.toList());
    }
}
