package com.example.p3.adapter

import android.content.Context
import android.content.Intent
import android.icu.lang.UCharacter.VerticalOrientation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.p3.DetailActivity
import com.example.p3.MainActivity
import com.example.p3.model.Book
import com.example.p3.R

class BookAdapter(
    private val context: Context,
    private val dataset: List<Book>
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.item_title)
        val authorTextView: TextView = view.findViewById(R.id.item_author)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val firstRow: LinearLayout = view.findViewById(R.id.first_row)
        val secondRow: LinearLayout = view.findViewById(R.id.second_row)
        val titlePlace: TextView = view.findViewById(R.id.titlePlace)
        val authorPlace: TextView = view.findViewById(R.id.authorPlace)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return BookViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val item = dataset[position]
        holder.titleTextView.text = context.resources.getString(item.titleResourceId)
        holder.authorTextView.text = context.resources.getString(item.authorResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.titlePlace.layoutParams.width = 300
        holder.authorPlace.layoutParams.width = 300
        if (MainActivity.LINEAR) {
            holder.firstRow.orientation = LinearLayout.HORIZONTAL
            holder.secondRow.orientation = LinearLayout.HORIZONTAL
            holder.imageView.layoutParams.height = 750
            holder.titlePlace.textSize= 26F
            holder.authorPlace.textSize= 26F
        } else {
            holder.firstRow.orientation = LinearLayout.VERTICAL
            holder.secondRow.orientation = LinearLayout.VERTICAL
            holder.imageView.layoutParams.height = 330
            holder.titlePlace.textSize= 24F
            holder.authorPlace.textSize= 24F
        }


        holder.imageView.setOnClickListener {
            val context1 = holder.itemView.context
            val intent = Intent(context1, DetailActivity::class.java)
            intent.putExtra(
                DetailActivity.TITLE,
                context.resources.getString(item.titleResourceId)
            )
            intent.putExtra(
                DetailActivity.AUTHOR,
                context.resources.getString(item.authorResourceId)
            )
            intent.putExtra(
                DetailActivity.PUBLISHER,
                context.resources.getString(item.publisherResourceId)
            )
            intent.putExtra(
                DetailActivity.YEAR_OF_PUBLICATION,
                context.resources.getInteger(item.yearOfPublicationResourceId)
            )
            intent.putExtra(
                DetailActivity.EDITION,
                context.resources.getInteger(item.editionResourceId)
            )
            intent.putExtra(
                DetailActivity.ISBN,
                context.resources.getString(item.ISBNResourceId)
            )
            intent.putExtra(
                DetailActivity.PAGE_NUMBER,
                context.resources.getInteger(item.pageNumberResourceId)
            )
            intent.putExtra(
                DetailActivity.SUMMARY,
                context.resources.getString(item.summaryResourceId)
            )
            intent.putExtra(
                DetailActivity.IMAGE,
                item.imageResourceId
            )
            context1.startActivity(intent)
        }


    }


    override fun getItemCount() = dataset.size
}