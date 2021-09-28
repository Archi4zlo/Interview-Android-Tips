package com.archi4zlo.interviewandroidtips.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailTipViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is detail tip Fragment"
    }
    val text: LiveData<String> = _text
}