package ru.rutmiit.androidsocialnetwork.fragments

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.fragment.findNavController
import ru.rutmiit.androidsocialnetwork.R
import ru.rutmiit.androidsocialnetwork.databinding.FragmentSignupBinding

/**
 * Экран реги
 */
class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreate(savedInstanceState)
        binding = FragmentSignupBinding.inflate(layoutInflater)
        val view = binding.root

        binding.regButton.setOnClickListener {
            val email = binding.emailAddressText.text.toString()
            val password = binding.passwordText.text.toString()
            val userBundle = Bundle()
            userBundle.putString("email", email)
            userBundle.putString("password", password)
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.emailAddressText.error = "Введите корректный email адрес"
            } else if (password.length < 5) {
                binding.passwordText.error = "Слишком короткий пароль"
            } else {
                this.findNavController().navigate(R.id.signInFragment)
            }
        }

        binding.loginRef.setOnClickListener {
            this.findNavController().navigate(R.id.signInFragment)
        }

        Log.d("SignUpActivity", "onCreate")

        return view
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
}