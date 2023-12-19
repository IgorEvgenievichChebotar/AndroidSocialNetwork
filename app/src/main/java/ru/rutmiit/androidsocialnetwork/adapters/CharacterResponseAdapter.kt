package ru.rutmiit.androidsocialnetwork.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.rutmiit.androidsocialnetwork.databinding.ListItemBinding

class CharacterResponseAdapter(private var items: List<ru.rutmiit.androidsocialnetwork.data.Character>) :
    RecyclerView.Adapter<CharacterResponseAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newData: List<ru.rutmiit.androidsocialnetwork.data.Character>) {
        this.items = newData
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(character: ru.rutmiit.androidsocialnetwork.data.Character) {
            with(binding) {
                nameTextView.text = if (character.name != "") character.name else "-"
                cultureTextView.text = if (character.culture != "") character.culture else "-"
                bornTextView.text = if (character.born != "") character.born else "-"
                aliasesTextView.text = if (character.aliases.joinToString(", ") != "") character.aliases.joinToString(", ") else "-"
                titlesTextView.text = if (character.titles.joinToString(", ") != "") character.titles.joinToString(", ") else "-"
                playedByNameTextView.text = if (character.playedBy.joinToString(", ") != "") character.playedBy.joinToString(", ") else "-"
            }
        }
    }
}