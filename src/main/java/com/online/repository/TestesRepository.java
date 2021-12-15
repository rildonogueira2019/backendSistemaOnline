package com.online.repository;

import com.online.model.entity.Testes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestesRepository extends JpaRepository<Testes, Integer> {
}