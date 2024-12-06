package com.integracaobackend.repositories;

import com.integracaobackend.entity.Meter;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MeterRepository extends JpaRepository<Meter, Long> {
}
