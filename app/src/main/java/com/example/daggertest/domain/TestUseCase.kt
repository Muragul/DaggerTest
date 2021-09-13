package com.example.daggertest.domain

import javax.inject.Inject

class TestUseCase @Inject constructor(private val testRepository: TestRepository) {

    fun passAuth(email: String, password: String) = testRepository.login(email, password)
}