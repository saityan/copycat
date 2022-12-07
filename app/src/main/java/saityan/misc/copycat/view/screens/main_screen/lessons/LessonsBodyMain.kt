package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LessonsBodyMain(subject: String, timePeriod: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            LessonIconMain(subjectName = subject)
        }
        Column {
            LessonNameMain(subject)
            LessonTimeMain(timePeriod)
        }
    }
}

@Preview(showBackground = false)
@Composable
fun LessonsBodyPreview() {
    LessonsBodyMain(subject = "History", timePeriod = "8:00-8:45")
}
