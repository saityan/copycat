package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Lesson(
    lesson: String,
    teacher: String,
    timePeriod: String
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row {
           LessonTimePeriod(timePeriod = timePeriod)
        }
        Row {
            Column {
                LessonName(lesson)
                TeacherName(teacher)
            }
        }
    }
}
