package com.integracaobackend.repositories;

import com.integracaobackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findById(int id);
    List<Category> findByLineId(int id);
    List<Category> findByLineName(String name);
}
