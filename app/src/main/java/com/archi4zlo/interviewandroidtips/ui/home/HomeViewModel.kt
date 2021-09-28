package com.archi4zlo.interviewandroidtips.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "A great day to learn something new"
    }
    val text: LiveData<String> = _text
}