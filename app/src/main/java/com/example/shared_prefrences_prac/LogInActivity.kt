package com.example.shared_prefrences_prac

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shared_prefrences_prac.databinding.ActivityLogInBinding
import com.example.shared_prefrences_prac.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
lateinit var bindingLogInBinding: ActivityLogInBinding

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingLogInBinding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(bindingLogInBinding.root)

        val sharedPrefs = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val myButton = bindingLogInBinding.logInButton

        // Set an OnClickListener for the button
        myButton.setOnClickListener {

            val isChecked = myButton.isPressed
            // Set the value in SharedPreferences based on the button's
            sharedPrefs.edit().putBoolean("myPrefs", isChecked).apply()
            // Start the desired activity when the button is clicked
            val intent = Intent(this, ContentActivity::class.java)
            startActivity(intent)
        }

    }
}