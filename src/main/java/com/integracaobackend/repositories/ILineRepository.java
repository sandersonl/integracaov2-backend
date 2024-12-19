package com.integracaobackend.repositories;

import com.integracaobackend.entity.Line;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ILineRepository extends JpaRepository<Line, Long> {
    Line findById(int id);
}
