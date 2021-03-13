package com.easycoding.auth.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class UserDetail(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    val username: String,
    val password: String,
    val active: Boolean,
    val isExpired: Boolean,
    val isLocked: Boolean,
    val isNotExpired: Boolean,
    @ManyToOne
    @JsonManagedReference
    val role: Role
)