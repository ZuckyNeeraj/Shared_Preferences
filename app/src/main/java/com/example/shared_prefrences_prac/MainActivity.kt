package com.example.shared_prefrences_prac

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.shared_prefrences_prac.databinding.ActivityLogInBinding
import com.example.shared_prefrences_prac.databinding.ActivityMainBinding

/**
 * This is a app that will use shared preferences to remember the state of user.
 * If user uses for the first time login screen will be displayed.
 * Otherwise login screen will be displayed.
 * @author Neeraj Mahapatra
 */

lateinit var bindingMainBinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainBinding.root)
    }
}