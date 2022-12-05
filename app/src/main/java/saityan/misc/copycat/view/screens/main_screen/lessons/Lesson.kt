package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import javax.security.auth.Subject

@Composable
fun Lesson(lessonsCount: Int, subject: String, timePeriod: String) {
    Row(verticalAlignment = Alignment.Top) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 6.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row () {
                LessonHeader(lessonsCount = lessonsCount)
            }
            Row() {
                Column() {
                    LessonIcon(subjectName = subject)
                }
                Column {
                    LessonsBody(subject = subject, timePeriod = timePeriod)
                }
            }
        }
    }
    Spacer(Modifier.height(32.dp))
}