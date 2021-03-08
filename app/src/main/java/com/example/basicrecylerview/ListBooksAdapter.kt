package com.example.basicrecylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBooksAdapter(private val listBooks: ArrayList<Books>): RecyclerView.Adapter<ListBooksAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_item_author)
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_item_photo)

    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_books, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBooks.size
    }

    override fun onBindViewHolder(holder: ListBooksAdapter.ListViewHolder, position: Int) {
        val books = listBooks[position]
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listBooks[holder.adapterPosition]) }
        Glide.with(holder.itemView.context)
            .load(books.photo)
            .apply(RequestOptions().override(250, 250))
            .into(holder.imgPhoto)
        holder.tvName.text = books.name
        holder.tvAuthor.text = books.author
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Books)
    }

}