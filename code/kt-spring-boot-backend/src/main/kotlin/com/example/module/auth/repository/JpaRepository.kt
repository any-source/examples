package com.example.module.auth.repository

import com.example.module.auth.model.AuthModel
import org.hibernate.validator.constraints.UUID
import org.springframework.data.jpa.repository.JpaRepository

interface AuthRepository : JpaRepository<AuthModel, UUID>