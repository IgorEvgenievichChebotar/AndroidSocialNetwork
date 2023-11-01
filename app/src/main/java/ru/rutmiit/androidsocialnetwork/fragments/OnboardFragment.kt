package ru.rutmiit.androidsocialnetwork.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import ru.rutmiit.androidsocialnetwork.R
import ru.rutmiit.androidsocialnetwork.data.User
import ru.rutmiit.androidsocialnetwork.databinding.FragmentOnboardBinding

/**
 * Стартовый экран
 */
class OnboardFragment : Fragment() {
    private lateinit var binding: FragmentOnboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardBinding.inflate(layoutInflater)
        val view = binding.root

        Log.d("OnboardActivity", "onCreate")

        binding.button.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<SignInFragment>(R.id.fragment_container)
            }
        }

        return view;
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
}