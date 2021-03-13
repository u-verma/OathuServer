package com.easycoding.auth.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    @Enumerated(EnumType.STRING)
    val role: RoleType
) {
    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    @JsonBackReference
    var userDetail: MutableList<UserDetail>? = null
}