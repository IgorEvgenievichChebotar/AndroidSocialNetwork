package ru.rutmiit.androidsocialnetwork.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import ru.rutmiit.androidsocialnetwork.adapters.CharacterResponseAdapter
import ru.rutmiit.androidsocialnetwork.adapters.ChatAdapter
import ru.rutmiit.androidsocialnetwork.data.Chat
import ru.rutmiit.androidsocialnetwork.databinding.FragmentHomeBinding
import ru.rutmiit.androidsocialnetwork.repos.CharacterRepository
import ru.rutmiit.androidsocialnetwork.repos.CharacterRepositoryImpl


/**
 * Главный экран
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private var repo: CharacterRepository = CharacterRepositoryImpl()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        lifecycleScope.launch {
            val characters = repo.getCharacters()
            binding.recycler.adapter = CharacterResponseAdapter(characters)
            binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        }

        Log.d("HomeActivity", "onCreate")

        return view
    }

    override fun onStart() {
        super.onStart()
        Log.d("HomeActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("HomeActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("HomeActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("HomeActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("HomeActivity", "onDestroy")
    }
}