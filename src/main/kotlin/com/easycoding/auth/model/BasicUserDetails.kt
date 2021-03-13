package com.easycoding.auth.model

import com.easycoding.auth.entity.UserDetail
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class BasicUserDetails(private val userDetail: UserDetail) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> = mutableListOf(SimpleGrantedAuthority(userDetail.role.role.name))

    override fun getPassword(): String = userDetail.password

    override fun getUsername(): String = userDetail.username

    override fun isAccountNonExpired(): Boolean = userDetail.isNotExpired

    override fun isAccountNonLocked(): Boolean = !userDetail.isLocked

    override fun isCredentialsNonExpired(): Boolean = !userDetail.isExpired

    override fun isEnabled(): Boolean = userDetail.active
}