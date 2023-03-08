package com.example.shared_prefrences_prac

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.shared_prefrences_prac.databinding.ActivityContentBinding
import com.example.shared_prefrences_prac.databinding.ActivitySplashBinding

@SuppressLint("StaticFieldLeak")
lateinit var bindingSplashBinding: ActivitySplashBinding

// Declare the SharedPreferences object as a property of your activity
private lateinit var sharedPrefs: SharedPreferences

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingSplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(bindingSplashBinding.root)


        sharedPrefs = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val isContentLoaded = sharedPrefs.getBoolean("myPrefs", false)


        Handler().postDelayed({
            // Determine which activity to start based on the value of the boolean key
            val intent = if (isContentLoaded) {
                Intent(this, ContentActivity::class.java)
            } else {
                Intent(this, LogInActivity::class.java)
            }


            // Start the appropriate activity
            startActivity(intent)
            // Close the Splash screen activity
            finish()
        }, 2000)
    }
}