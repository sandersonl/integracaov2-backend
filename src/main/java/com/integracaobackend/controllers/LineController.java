package com.integracaobackend.controllers;

import com.integracaobackend.entity.Line;
import com.integracaobackend.services.ILineService;
import com.integracaobackend.services.impl.LineService;

import java.util.List;

public class LineController {

    private final ILineService lineService;

    public LineController() {
        lineService = new LineService();
    }

    public List<Line> getAllLine() {
        return lineService.getLineList();
    }

    public Line getLineById(int id) {
        return lineService.getLineById(id);
    }

}
