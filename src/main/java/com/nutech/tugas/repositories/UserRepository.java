package com.nutech.tugas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutech.tugas.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
