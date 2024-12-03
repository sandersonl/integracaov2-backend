package com.integracaobackend.services;

import com.integracaobackend.entity.Meter;
import com.integracaobackend.models.MeterModel;
import com.integracaobackend.repositories.IMeterRepository;
import com.integracaobackend.repositories.MeterRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MeterService implements IMeterService{

    private final IMeterRepository meterRepository = new MeterRepository();
    private final List<Meter> meters = meterRepository.list();

    private final List<MeterModel> meterList = meters.stream().map(meter -> {
        return new MeterModel(meter.getId(), meter.getCategory().getId(), meter.getName(), meter.getCategory().getName());
    }).collect(Collectors.toList());

    public MeterService() {

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
