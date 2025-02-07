package com.example.module.auth.model

import org.hibernate.validator.constraints.UUID

data class AuthModel(
    var id: UUID? = null,
)