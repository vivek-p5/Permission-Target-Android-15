package com.example.permission

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun MediaListItems(modifier: Modifier = Modifier, file: MediaFile) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        when (file.type) {
            MediaType.IMAGE -> AsyncImage(
                model = file.uri,
                contentDescription = null,
                modifier = Modifier.width(100.dp)
            )

            MediaType.AUDIO -> Image(
                imageVector = Icons.Default.Settings,
                contentDescription = null,
                modifier = Modifier.width(100.dp)
            )

            MediaType.VIDEO -> Image(
                imageVector = Icons.Default.Build,
                contentDescription = null,
                modifier = Modifier.width(100.dp)
            )
        }

        Text("${file.name} - ${file.type}", modifier = Modifier.padding(16.dp).weight(1f))
    }
}