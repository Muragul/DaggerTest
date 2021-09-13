package com.example.daggertest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertest.App
import com.example.daggertest.R
import com.example.daggertest.ui.test.TestFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as App).appComponent.inject(this)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, TestFragment(), "")
                    .commitNow()
        }

    }
}