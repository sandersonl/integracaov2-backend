package com.integracaobackend.repositories;

import com.integracaobackend.entity.Line;

import java.util.List;

public interface ILineRepository {
    List<Line> list();
    Line getLineById(int id);
}
