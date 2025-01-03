package com.integracaobackend.services.impl;

import com.integracaobackend.entity.Model;
import com.integracaobackend.repositories.IModelRepository;
import com.integracaobackend.repositories.impl.ModelRepository;
import com.integracaobackend.services.IModelService;

import java.util.List;

public class ModelService implements IModelService {

    private final IModelRepository modelRepository = new ModelRepository();

    public ModelService() {
    }

    @Override
    public List<Model> getMeterList() {
        return modelRepository.list();
    }

    @Override
    public List<Model> getModelByCategoryId(int id) {
        return modelRepository.getModelByIdCategory(id);
    }
}
