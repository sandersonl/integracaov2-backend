package com.integracaobackend.services;

import com.integracaobackend.entity.Model;

import java.util.List;

public interface IModelService {
    List<Model> getMeterList();
    List<Model> getModelByCategoryId(int id);
}
