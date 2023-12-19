package ru.rutmiit.androidsocialnetwork.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.fragment.findNavController
import ru.rutmiit.androidsocialnetwork.R
import ru.rutmiit.androidsocialnetwork.data.User
import ru.rutmiit.androidsocialnetwork.databinding.FragmentSigninBinding

/**
 * Экран входа
 */
class SignInFragment : Fragment() {
    private lateinit var binding: FragmentSigninBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSigninBinding.inflate(layoutInflater)
        val view = binding.root

        val user = arguments?.get("user") as? User
        binding.emailAddressText.setText(user?.email)
        binding.passwordText.setText(user?.password)

        binding.loginButton.setOnClickListener {
            val email = binding.emailAddressText.text.toString()
            val password = binding.passwordText.text.toString()
            if (!email.contains("@")) binding.emailAddressText.error =
                "Введите корректный email адрес"
            else if (password.length < 5) binding.passwordText.error = "Слишком короткий пароль"
            else {
                this.findNavController().navigate(R.id.homeFragment)
            }
        }

        binding.regRef.setOnClickListener {
            this.findNavController().navigate(R.id.signUpFragment)
        }

        Log.d("SignInActivity", "onCreate")

        return view
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

}