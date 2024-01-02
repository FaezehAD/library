package com.example.p3.data

import com.example.p3.R
import com.example.p3.model.Book

class Datasource {
    fun loadBooks(): List<Book> {
        return listOf(
            Book(
                R.string.title1, R.string.author1, R.string.publisher1,
                R.integer.yearOfPublication1, R.integer.edition1, R.string.ISBN1,
                R.string.summary1, R.integer.pageNumber1, R.drawable.ch
            ),

            Book(
                R.string.title2, R.string.author2, R.string.publisher2,
                R.integer.yearOfPublication2, R.integer.edition2, R.string.ISBN2,
                R.string.summary2, R.integer.pageNumber2, R.drawable.n
            ),

            Book(
                R.string.title3, R.string.author3, R.string.publisher3,
                R.integer.yearOfPublication3, R.integer.edition3, R.string.ISBN3,
                R.string.summary3, R.integer.pageNumber3, R.drawable.a
            ),

            Book(
                R.string.title4, R.string.author4, R.string.publisher4,
                R.integer.yearOfPublication4, R.integer.edition4, R.string.ISBN4,
                R.string.summary4, R.integer.pageNumber4, R.drawable.o
            ),

            Book(
                R.string.title5, R.string.author5, R.string.publisher5,
                R.integer.yearOfPublication5, R.integer.edition5, R.string.ISBN5,
                R.string.summary5, R.integer.pageNumber5, R.drawable.m
            ),

            Book(
                R.string.title6, R.string.author6, R.string.publisher6,
                R.integer.yearOfPublication6, R.integer.edition6, R.string.ISBN6,
                R.string.summary6, R.integer.pageNumber6, R.drawable.d
            ),

            Book(
                R.string.title7, R.string.author7, R.string.publisher7,
                R.integer.yearOfPublication7, R.integer.edition7, R.string.ISBN6,
                R.string.summary7, R.integer.pageNumber7, R.drawable.p
            ),

            Book(
                R.string.title8, R.string.author8, R.string.publisher8,
                R.integer.yearOfPublication8, R.integer.edition8, R.string.ISBN8,
                R.string.summary8, R.integer.pageNumber8, R.drawable.s
            )
        )
    }
}