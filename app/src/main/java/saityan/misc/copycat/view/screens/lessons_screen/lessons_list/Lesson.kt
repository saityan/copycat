package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Lesson(
    subject: String,
    teacher: String,
    timePeriod: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row {
           LessonTimePeriod(timePeriod = timePeriod)
        }
        Row {
            Column {
                LessonName(subject)
                TeacherName(teacher)
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun LessonPreview() {
    Lesson(
        subject = "Math",
        teacher = "Mr Thomas",
        timePeriod = "10:00-10:45"
    )
}
