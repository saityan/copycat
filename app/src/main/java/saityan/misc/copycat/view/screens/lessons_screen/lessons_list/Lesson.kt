package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Lesson(
    subject: String,
    teacher: String,
    timePeriod: String
) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.padding(start = 6.dp)
    ) {
        LessonTimePeriod(timePeriod = timePeriod)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.padding(6.dp)
            ) {
                LessonIcon(subject)
            }
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
