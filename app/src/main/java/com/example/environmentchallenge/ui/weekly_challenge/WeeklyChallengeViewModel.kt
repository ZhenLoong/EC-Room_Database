package com.example.environmentchallenge.ui.weekly_challenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeeklyChallengeViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply{
        value="This is Weekly Challenge Fragment"
    }

    val text: LiveData<String> = _text
    var count:Int = 0

    fun addProgress():Int {
        count+=1
        return count
    }

    fun getCurrentProgress(): Int{
        return count;
    }

}
