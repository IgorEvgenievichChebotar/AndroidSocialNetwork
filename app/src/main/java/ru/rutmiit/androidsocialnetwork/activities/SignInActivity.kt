package ru.rutmiit.androidsocialnetwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.rutmiit.androidsocialnetwork.data.User
import ru.rutmiit.androidsocialnetwork.databinding.ActivitySigninBinding

/**
 * Экран входа
 */
class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.extras?.get("user") as? User
        binding.emailAddressText.setText(user?.email)
        binding.passwordText.setText(user?.password)

        binding.loginButton.setOnClickListener {
            val email = binding.emailAddressText.text.toString()
            val password = binding.passwordText.text.toString()
            if (!email.contains("@")) binding.emailAddressText.error =
                "Введите корректный email адрес"
            else if (password.length < 5) binding.passwordText.error = "Слишком короткий пароль"
            else startActivity(Intent(this, HomeActivity::class.java))
        }

        binding.regRef.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        Log.d("SignInActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SignInActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SignInActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SignInActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SignInActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SignInActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SignInActivity", "onRestart")
    }

}