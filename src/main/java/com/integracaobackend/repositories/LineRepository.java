package com.integracaobackend.repositories;

import com.integracaobackend.entity.Line;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LineRepository extends JpaRepository<Line, Long> {
    Line findById(int id);
}
