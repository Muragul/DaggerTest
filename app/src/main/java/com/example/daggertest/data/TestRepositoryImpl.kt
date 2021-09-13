package com.example.daggertest.data

import com.example.daggertest.domain.TestRepository
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor() : TestRepository {

    override fun login(email: String, password: String): String {
        return "Success"
    }
}