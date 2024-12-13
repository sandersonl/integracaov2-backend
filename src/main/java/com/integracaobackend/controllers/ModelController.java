package com.integracaobackend.controllers;

import com.integracaobackend.entity.Model;
import com.integracaobackend.services.IModelService;
import com.integracaobackend.services.impl.ModelService;

import java.util.List;

public class ModelController {

    private final IModelService modelService;

    public ModelController() {
       modelService = new ModelService();
    }

    public List<Model> getAllModel() {
        return modelService.getMeterList();
    }

    public List<Model> getModelByCategoryId(int id) {
        return modelService.getModelByCategoryId(id);
    }
}
