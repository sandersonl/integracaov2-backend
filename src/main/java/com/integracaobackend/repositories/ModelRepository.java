package com.integracaobackend.repositories;

import com.integracaobackend.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ModelRepository extends JpaRepository<Model, Long> {
    Model findById(int id);
    List<Model> findByCategoryId(int id);
    List<Model> findByCategoryName(String name);
    List<Model> findByCategoryLineName(String name);
}
