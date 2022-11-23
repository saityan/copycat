package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LessonTimePeriod(timePeriod: String) {
    Text(
        text = timePeriod,
        style = MaterialTheme.typography.h3
    )
}

@Composable
@Preview(showBackground = false)
fun LessonTimePeriodPreview() {
    LessonTimePeriod(timePeriod = "12:00-12:45")
}
