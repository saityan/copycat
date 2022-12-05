package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LessonsBody(subject: String, timePeriod: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            LessonIcon(subjectName = subject)
        }
        Column {
            LessonName(subject)
            LessonTime(timePeriod)
        }
    }
}

@Preview(showBackground = false)
@Composable
fun LessonsBodyPreview() {
    LessonsBody(subject = "History", timePeriod = "8:00-8:45")
}
