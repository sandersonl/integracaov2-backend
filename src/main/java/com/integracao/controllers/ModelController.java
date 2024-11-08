package com.integracao.controllers;

import com.integracao.models.MeterModel;
import com.integracao.services.IMeterService;
import com.integracao.services.impl.TempMeterService;

import java.util.List;

public class ModelController {

    private IMeterService meterService;

    public ModelController() {
       meterService = new TempMeterService();
    }

    public List<MeterModel> getAllModel() {
        return meterService.getMeterList();
    }

    public List<MeterModel> getModelByCategoryId(int id) {
        return meterService.getMeterByCategoryId(id);
    }
}
