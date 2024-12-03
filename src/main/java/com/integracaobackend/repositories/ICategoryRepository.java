package com.integracaobackend.repositories;

import com.integracaobackend.entity.Category;

import java.util.List;

public interface ICategoryRepository {
    List<Category> list();
    List<Category> getByLineId(int id);
}
