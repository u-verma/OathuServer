package com.easycoding.auth.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ClientDetail(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    val clientId: String,
    val resourceIds: String? = null,
    val isSecretRequired: Boolean,
    val clientSecret: String,
    val isScoped: Boolean,
    val scope: String,
    val isAutoApprove: Boolean,
    val authorizedGrantTypes: String,
    val registeredRedirectUri: String? = null,
    val authorities: String? = null,
    val accessTokenValiditySeconds: Int? = null,
    val refreshTokenValiditySeconds: Int? = null,
    val additionalInformation: String? = null
)