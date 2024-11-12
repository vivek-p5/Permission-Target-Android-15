package com.example.permission

import android.net.Uri

data class MediaFile(
    val uri: Uri,
    val name: String,
    val type: MediaType
)
