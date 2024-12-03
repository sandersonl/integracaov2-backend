package com.integracaobackend.services;

import com.integracaobackend.models.LineModel;

import java.util.List;

public interface ILineService {
    List<LineModel> getLineList();
    LineModel getLineById(int id);
}
