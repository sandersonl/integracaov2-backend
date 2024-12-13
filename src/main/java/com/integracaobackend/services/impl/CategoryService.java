package com.integracaobackend.services.impl;

import com.integracaobackend.entity.Category;
import com.integracaobackend.repositories.impl.CategoryRepository;
import com.integracaobackend.repositories.ICategoryRepository;
import com.integracaobackend.services.ICategoryService;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryService implements ICategoryService {

    private final ICategoryRepository categoryRepository = new CategoryRepository();

    public CategoryService() {
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.list();
    }

    @Override
    public List<Category> getCategoryByLineId(int id) {
        return categoryRepository.getByLineId(id);
    }
}
