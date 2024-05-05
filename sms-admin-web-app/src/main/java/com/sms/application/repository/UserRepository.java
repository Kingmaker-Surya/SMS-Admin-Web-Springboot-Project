package com.sms.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.application.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
