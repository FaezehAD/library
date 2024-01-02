package com.example.p3.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.annotation.IntegerRes

data class Book(
    @StringRes val titleResourceId: Int,
    @StringRes val authorResourceId: Int,
    @StringRes val publisherResourceId: Int,
    @IntegerRes val yearOfPublicationResourceId: Int,
    @IntegerRes val editionResourceId: Int,
    @StringRes val ISBNResourceId: Int,
    @StringRes val summaryResourceId: Int,
    @IntegerRes val pageNumberResourceId: Int,
    @DrawableRes val imageResourceId: Int
)