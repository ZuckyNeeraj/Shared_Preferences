package com.example.shared_prefrences_prac

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.shared_prefrences_prac.databinding.ActivityContentBinding
import com.example.shared_prefrences_prac.databinding.ActivityLogInBinding

@SuppressLint("StaticFieldLeak")
lateinit var bindingContentBinding: ActivityContentBinding

class ContentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingContentBinding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(bindingContentBinding.root)

        val sharedPrefs = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val myButton = bindingContentBinding.button

        // Set an OnClickListener for the button
        myButton.setOnClickListener {

            val isChecked = myButton.isPressed
            // Set the value in SharedPreferences based on the button's

            sharedPrefs.edit().putBoolean("myPrefs", !isChecked).apply()
            // Start the desired activity when the button is clicked
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }
    }
}