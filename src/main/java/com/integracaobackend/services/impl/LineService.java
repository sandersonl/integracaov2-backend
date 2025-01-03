package com.integracaobackend.services.impl;

import com.integracaobackend.entity.Line;
import com.integracaobackend.repositories.ILineRepository;
import com.integracaobackend.repositories.impl.LineRepository;
import com.integracaobackend.services.ILineService;

import java.util.List;

public class LineService implements ILineService {

    private final ILineRepository lineRepository = new LineRepository();

    public LineService() {
    }

    @Override
    public List<Line> getLineList() {
        return lineRepository.list();
    }

    @Override
    public Line getLineById(int id) {
        return lineRepository.getLineById(id);
    }
}
