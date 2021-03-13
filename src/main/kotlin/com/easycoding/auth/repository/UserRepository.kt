package com.easycoding.auth.repository

import com.easycoding.auth.entity.UserDetail
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserDetail, Int> {
    fun findByUsername(username: String): Optional<UserDetail>
}