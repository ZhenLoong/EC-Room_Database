package com.example.environmentchallenge.ui.daily_challenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DailyChallengeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is daily challenge Fragment"
    }
    val text: LiveData<String> = _text
}
