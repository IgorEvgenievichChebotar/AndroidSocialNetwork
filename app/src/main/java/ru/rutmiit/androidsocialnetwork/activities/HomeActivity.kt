package ru.rutmiit.androidsocialnetwork.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ru.rutmiit.androidsocialnetwork.adapters.ChatAdapter
import ru.rutmiit.androidsocialnetwork.data.Chat
import ru.rutmiit.androidsocialnetwork.databinding.ActivityHomeBinding


/**
 * Главный экран
 */
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val chatList = listOf(
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
            Chat("Имя", "Профиль", "ласт мессадж", "07.09.2024"),
        )

        binding.recycler.adapter = ChatAdapter(chatList)
        binding.recycler.layoutManager = LinearLayoutManager(this)

        Log.d("HomeActivity", "onCreate")
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