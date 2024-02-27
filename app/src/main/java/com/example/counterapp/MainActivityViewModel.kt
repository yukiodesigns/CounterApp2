package com.example.counterapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    var counter = MutableLiveData<Int>()

    init{
        counter.value = 0
    }
    fun updateCount(){
        counter.value = (counter.value)?.plus(1)
    }
}