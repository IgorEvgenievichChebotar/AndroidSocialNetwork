package ru.rutmiit.androidsocialnetwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import ru.rutmiit.androidsocialnetwork.R
import ru.rutmiit.androidsocialnetwork.databinding.ActivityOnboardBinding
import ru.rutmiit.androidsocialnetwork.databinding.ActivitySigninBinding

/**
 * Стартовый экран
 */
class OnboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("OnboardActivity", "onCreate")

        binding.button.setOnClickListener{
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("OnboardActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnboardActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnboardActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnboardActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnboardActivity", "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("OnboardActivity", "onRestart")
    }
}