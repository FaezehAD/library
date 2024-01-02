package com.example.p3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.p3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val TITLE = "title"
        const val AUTHOR = "author"
        const val PUBLISHER = "publisher"
        const val YEAR_OF_PUBLICATION = "year of publication"
        const val EDITION = "edition"
        const val ISBN = "ISBN"
        const val PAGE_NUMBER = "page number"
        const val SUMMARY = "summary"
        const val IMAGE = "imageView"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val titleText = intent?.extras?.getString(TITLE).toString()
        val authorText = intent?.extras?.getString(AUTHOR).toString()
        val publisherText = intent?.extras?.getString(PUBLISHER).toString()
        val yearOfPublicationText = intent?.extras?.getInt(YEAR_OF_PUBLICATION).toString()
        val editionText = intent?.extras?.getInt(EDITION).toString()
        val ISBN_Text = intent?.extras?.getString(ISBN).toString()
        val pageNumberText = intent?.extras?.getInt(PAGE_NUMBER).toString()
        val summaryText = intent?.extras?.getString(SUMMARY).toString()
        val imageView = intent?.extras?.getInt(IMAGE)

        title = titleText

        binding.itemAuthor.text = authorText
        binding.itemPublisher.text = publisherText
        binding.itemYearOfPublication.text = yearOfPublicationText
        binding.itemEdition.text = editionText
        binding.itemISBN.text = ISBN_Text
        binding.itemPageNumber.text = buildString {
            append(pageNumberText)
            append(" صفحه ")
        }
        binding.itemSummary.text = summaryText
        binding.itemSummary.text = buildString {
            append(summaryText)
            append("\n\n")
        }
        if (imageView != null) {
            binding.itemImage.setImageResource(imageView)
        }

        binding.authorPlace.layoutParams.width = 200
        binding.publisherPlace.layoutParams.width = 200
        binding.yearOfPublicationPlace.layoutParams.width = 200
        binding.editionPlace.layoutParams.width = 200
        binding.ISBNPlace.layoutParams.width = 200
        binding.pageNumberPlace.layoutParams.width = 200
        binding.summaryPlace.layoutParams.width = 200

    }
}