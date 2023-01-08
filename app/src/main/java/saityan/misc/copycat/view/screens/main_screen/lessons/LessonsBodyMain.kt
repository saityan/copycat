package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LessonsBodyMain(subject: String, timePeriod: String) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 12.dp)
        ) {
            SubjectIconMain(subject = subject)
        }
        Column {
            SubjectMain(subject)
            LessonTimeMain(timePeriod)
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun LessonsBodyPreview() {
    LessonsBodyMain(subject = "History", timePeriod = "8:00-8:45")
}
