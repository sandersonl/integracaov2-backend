package com.integracaobackend.repositories;

import com.integracaobackend.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IModelRepository extends JpaRepository<Model, Long> {
    Model findById(int id);
}
