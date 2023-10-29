package com.fullstack.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.crud.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}

