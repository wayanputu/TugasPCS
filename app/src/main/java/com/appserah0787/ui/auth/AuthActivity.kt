package com.appserah0787.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.appserah0787.R
import com.appserah0787.data.model.AuthUser
import com.appserah0787.databinding.ActivityAuthBinding
import com.appserah0787.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser? ) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}