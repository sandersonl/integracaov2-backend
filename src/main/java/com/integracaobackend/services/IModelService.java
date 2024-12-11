package com.integracaobackend.services;

import com.integracaobackend.models.MeterModel;

import java.util.List;

public interface IModelService {
    List<MeterModel> getMeterList();
    List<MeterModel> getMeterByCategoryId(int id);
}
