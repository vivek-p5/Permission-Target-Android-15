package com.example.permission

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


class MainViewModel(private val mediaReader: MediaReader) : ViewModel() {

    var files by mutableStateOf<List<MediaFile>>(listOf<MediaFile>())
        private set

    init {
        files = mediaReader.getAllMediaFiles()
    }

}