package com.integracaobackend.controllers;

import com.integracaobackend.models.MeterModel;
import com.integracaobackend.services.IMeterService;
import com.integracaobackend.services.MeterService;

import java.util.List;

public class MeterController {

    private final IMeterService meterService;

    public MeterController() {
       meterService = new MeterService();
    }

    public List<MeterModel> getAllModel() {
        return meterService.getMeterList();
    }

    public List<MeterModel> getModelByCategoryId(int id) {
        return meterService.getMeterByCategoryId(id);
    }
}
