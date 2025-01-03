package com.integracaobackend.services;

import com.integracaobackend.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getCategoryList();
    List<Category> getCategoryByLineId(int id);
}
