package com.example.daggertest.ui.test

import androidx.lifecycle.ViewModel
import com.example.daggertest.domain.TestUseCase
import javax.inject.Inject

class TestViewModel @Inject constructor(
    private val testUseCase: TestUseCase
) : ViewModel() {

    fun passAuth(email: String, password: String) = testUseCase.passAuth(email, password)
}