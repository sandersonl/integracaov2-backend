package com.integracao.services;

import com.integracao.models.LineModel;

import java.util.List;

public interface ILineService {
    List<LineModel> getLineList();
    LineModel getLineById(int id);
}
