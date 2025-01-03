package com.integracaobackend.services;

import com.integracaobackend.entity.Line;

import java.util.List;

public interface ILineService {
    List<Line> getLineList();
    Line getLineById(int id);
}
