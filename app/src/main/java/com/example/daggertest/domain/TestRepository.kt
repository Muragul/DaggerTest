package com.example.daggertest.domain

interface TestRepository {
    fun login(email: String, password: String): String
}