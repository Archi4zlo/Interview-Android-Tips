package com.archi4zlo.interviewandroidtips.model

data class Tip(

    val id: Long,
    val language: String,
    val question: String,
    val answer: String,
    val isFavourite: Boolean,
    val isSolve: Boolean,
)
