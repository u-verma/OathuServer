package com.easycoding.auth.repository;

import com.easycoding.auth.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Int>