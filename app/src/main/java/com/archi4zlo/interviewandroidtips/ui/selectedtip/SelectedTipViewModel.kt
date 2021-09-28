package com.archi4zlo.interviewandroidtips.ui.selectedtip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SelectedTipViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is selected tip Fragment"
    }
    val text: LiveData<String> = _text
}