package com.ironman.learningapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ironman.learningapp.databinding.ItemViewBinding

class HomeAdapter(private var list: List<User>) :
    RecyclerView.Adapter<HomeAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setValues(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setValues(list:List<User>){
        this.list=list
        notifyDataSetChanged()
    }

    class ItemViewHolder(private val itemViewBinding: ItemViewBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root) {
        fun setValues(user: User) {
            itemViewBinding.textView.text = user.name
        }

    }

    data class User(val name: String, val age: Int)
}