package com.integracaobackend.services;

import com.integracaobackend.models.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> getCategoryList();
    List<CategoryModel> getCategoryByLineId(int id);
}
