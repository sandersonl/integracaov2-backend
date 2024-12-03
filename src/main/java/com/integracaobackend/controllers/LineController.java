package com.integracaobackend.controllers;

import com.integracaobackend.models.LineModel;
import com.integracaobackend.services.ILineService;
import com.integracaobackend.services.LineService;

import java.util.List;

public class LineController {

    private final ILineService lineService;

    public LineController() {
        lineService = new LineService();
    }

    public List<LineModel> getAllLine() {
        return lineService.getLineList();
    }

    public LineModel getLineById(int id) {
        return lineService.getLineById(id);
    }

}
