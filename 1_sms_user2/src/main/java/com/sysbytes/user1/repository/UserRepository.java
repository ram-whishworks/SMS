package com.sysbytes.user1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sysbytes.user1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
