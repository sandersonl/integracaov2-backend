package com.integracao.services;

import com.integracao.models.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> getCategoryList();
    List<CategoryModel> getCategoryByLineId(int id);
}
