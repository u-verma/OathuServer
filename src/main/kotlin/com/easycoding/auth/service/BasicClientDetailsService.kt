package com.easycoding.auth.service

import com.easycoding.auth.model.BasicClientDetails
import com.easycoding.auth.repository.ClientDetailRepository
import org.springframework.security.oauth2.provider.ClientDetails
import org.springframework.security.oauth2.provider.ClientDetailsService
import org.springframework.stereotype.Service

@Service
class BasicClientDetailsService(
    private val clientDetailRepository: ClientDetailRepository
) : ClientDetailsService {

    override fun loadClientByClientId(clientId: String): ClientDetails {
        val clientDetail = clientDetailRepository.findByClientId(clientId).get()
        return BasicClientDetails(clientDetail)
    }
}