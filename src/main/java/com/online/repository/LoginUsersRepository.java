package com.online.repository;

import com.online.model.entity.Login;
import com.online.model.entity.Testes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUsersRepository extends JpaRepository<Login, Integer> {
}
