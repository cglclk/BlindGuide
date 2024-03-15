package com.example.blindguide.ui.main

import androidx.lifecycle.*

//import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()

    val text: LiveData<String> = _index.map { index ->
        "Hello world from section: $index"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}
