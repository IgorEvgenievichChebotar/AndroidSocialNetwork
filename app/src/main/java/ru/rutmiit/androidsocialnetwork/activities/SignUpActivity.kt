package ru.rutmiit.androidsocialnetwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.os.PatternMatcher
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.rutmiit.androidsocialnetwork.R
import ru.rutmiit.androidsocialnetwork.data.User
import ru.rutmiit.androidsocialnetwork.databinding.ActivitySignupBinding

/**
 * Экран реги
 */
class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regButton.setOnClickListener {
            val email = binding.emailAddressText.text.toString()
            val password = binding.passwordText.text.toString()
            val intent = Intent(this, SignInActivity::class.java)
            intent.putExtra("user", User(email, password))
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.emailAddressText.error = "Введите корректный email адрес"
            } else if (password.length < 5) {
                binding.passwordText.error = "Слишком короткий пароль"
            } else {
                startActivity(intent)
            }
        }

        binding.loginRef.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

        Log.d("SignUpActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SignUpActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SignUpActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SignUpActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SignUpActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SignUpActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SignUpActivity", "onRestart")
    }
}