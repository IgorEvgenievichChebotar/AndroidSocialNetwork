package ru.rutmiit.androidsocialnetwork.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.rutmiit.androidsocialnetwork.data.Chat
import ru.rutmiit.androidsocialnetwork.databinding.ChatItemBinding

class ChatAdapter(private val chatList: List<Chat>): RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    inner class ChatViewHolder(binding: ChatItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameTextView = binding.nameTextView
        val profileTextView = binding.profileTextView
        val messageTextView = binding.messageTextView
        val timeTextView = binding.timeTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding = ChatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.nameTextView.text = chatList[position].name
        holder.profileTextView.text = chatList[position].profile
        holder.messageTextView.text = chatList[position].lastMessage
        holder.timeTextView.text = chatList[position].sendTime

    }

    override fun getItemCount(): Int {
        return chatList.size
    }

}