package com.online.repository;

import com.online.model.entity.Processo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessoRepository extends JpaRepository<Processo, Integer> {
}