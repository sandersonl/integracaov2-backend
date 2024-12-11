package com.integracaobackend.services;

import com.integracaobackend.entity.Model;
import com.integracaobackend.models.MeterModel;

import java.util.List;
import java.util.stream.Collectors;

public class ModelService implements IModelService {


    private final List<Model> meters = null;

    private final List<MeterModel> meterList = meters.stream().map(meter -> {
        return new MeterModel(meter.getId(), meter.getCategory().getId(), meter.getName(), meter.getCategory().getName());
    }).collect(Collectors.toList());

    public ModelService() {

    }

    @Override
    public List<MeterModel> getMeterList() {
        return meterList;
    }

    @Override
    public List<MeterModel> getMeterByCategoryId(int id) {
        return meterList.stream().filter(meterModel -> meterModel.getCategoryId() == id).collect(Collectors.toList());
    }
}
