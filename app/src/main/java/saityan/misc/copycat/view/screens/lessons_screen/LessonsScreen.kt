package saityan.misc.copycat.view.screens.lessons_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.annotation.ExperimentalCoilApi
import saityan.misc.copycat.view.screens.lessons_screen.lessons_list.ListContent
import saityan.misc.copycat.view.screens.lessons_screen.topic.TopicLessons

@OptIn(ExperimentalCoilApi::class)
@Composable
fun LessonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Top
        ) {
            TopicLessons(day = "1 June")
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            ListContent()
        }
    }
}

@Composable
@Preview(showBackground = false)
fun LessonsScreenPreview() {
    LessonsScreen()
}
