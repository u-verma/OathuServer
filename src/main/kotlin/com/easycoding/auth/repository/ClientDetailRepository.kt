package com.easycoding.auth.repository

import com.easycoding.auth.entity.ClientDetail
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface ClientDetailRepository : JpaRepository<ClientDetail, Int> {
    fun findByClientId(clientId: String): Optional<ClientDetail>
}