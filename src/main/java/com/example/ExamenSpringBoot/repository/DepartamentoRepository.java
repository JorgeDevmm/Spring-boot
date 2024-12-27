package com.example.ExamenSpringBoot.repository;

import com.example.ExamenSpringBoot.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
