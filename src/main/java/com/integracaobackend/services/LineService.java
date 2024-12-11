package com.integracaobackend.services;

import com.integracaobackend.entity.Line;
import com.integracaobackend.models.LineModel;
import com.integracaobackend.repositories.LineRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LineService implements ILineService {


    private final List<Line> lines = null;

    private final List<LineModel> lineList = lines.stream().map(line -> {
        return new LineModel(line.getId(), line.getName());
    }).collect(Collectors.toList());

    public LineService() {
    }

    @Override
    public List<LineModel> getLineList() {
        return lineList;
    }

    @Override
    public LineModel getLineById(int id) {
        Optional<LineModel> first = lineList.stream().filter(lineModel -> lineModel.getId() == id).findFirst();
        return first.orElse(null);
    }
}
