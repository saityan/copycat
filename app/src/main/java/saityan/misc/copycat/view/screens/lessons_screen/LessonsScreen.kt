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
import saityan.misc.copycat.view.screens.lessons_screen.topic.LessonsTopic

@Composable
fun LessonsScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Top
        ) {
            LessonsTopic(day = "1 June")
        }
    }
}

@Composable
@Preview(showBackground = false)
fun LessonsScreenPreview() {
    LessonsScreen()
}
