package com.integracaobackend.repositories;

import com.integracaobackend.entity.Model;

import java.util.List;

public interface IModelRepository {
    List<Model> list();
    List<Model> getModelByIdCategory(int id);
}
