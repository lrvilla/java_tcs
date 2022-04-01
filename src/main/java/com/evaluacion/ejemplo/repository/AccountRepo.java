package com.evaluacion.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.ejemplo.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

}