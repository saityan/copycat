package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LessonBody(
    subject: String,
    teacher: String,
    isPairedLesson: Boolean = false,
    iconOpacity: Float = 1f,
    isOpenedIn: Boolean = false
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 12.dp)
        ) {
            SubjectIcon(subject = subject, opacity = iconOpacity)
        }
        Column {
            LessonName(lessonName = subject)
            TeacherName(teacher, isPairedLesson = isPairedLesson, isOpenedIn)
        }
    }
}

@Composable
@Preview(showBackground = false)
fun LessonBodyPreview() {
    LessonBody(subject = "History", teacher = "Mrs Thomas")
}
