package com.sms.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.application.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
