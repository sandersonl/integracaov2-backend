package com.integracaobackend.repositories;

import com.integracaobackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICategoryRepository extends JpaRepository<Category, Long> {
    Category findById(int id);
}
