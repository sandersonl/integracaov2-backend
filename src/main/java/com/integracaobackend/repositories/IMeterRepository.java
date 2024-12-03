package com.integracaobackend.repositories;

import com.integracaobackend.entity.Meter;

import java.util.List;

public interface IMeterRepository {
    List<Meter> list();
    List<Meter> getMeterByIdCategory(int id);
}
