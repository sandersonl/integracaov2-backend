package com.integracao.controllers;

import com.integracao.models.LineModel;
import com.integracao.services.ILineService;
import com.integracao.services.impl.TempLineService;

import java.util.List;

public class LineController {

    private ILineService lineService;

    public LineController() {
        lineService = new TempLineService();
    }

    public List<LineModel> getAllLine() {
        return lineService.getLineList();
    }

    public LineModel getLineById(int id) {
        return lineService.getLineById(id);
    }

}
