package com.nutech.tugas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutech.tugas.models.Saldo;

@Repository
public interface TopUpRepository extends JpaRepository<Saldo, String>{
}
