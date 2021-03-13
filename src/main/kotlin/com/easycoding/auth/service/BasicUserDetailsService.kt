package com.easycoding.auth.service

import com.easycoding.auth.model.BasicUserDetails
import com.easycoding.auth.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class BasicUserDetailsService(val userRepository: UserRepository) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        val userDetail = userRepository.findByUsername(username).get()
        return BasicUserDetails(userDetail)
    }
}