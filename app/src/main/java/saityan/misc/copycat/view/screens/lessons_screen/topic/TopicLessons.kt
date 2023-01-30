package saityan.misc.copycat.view.screens.lessons_screen.topic

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopicLessons(
    day: String
) {
    Row(
        modifier = Modifier.padding(end = 6.dp),
        verticalAlignment = Alignment.Top,
    ) {
        Column(Modifier.weight(7f)) {
            TopicTextLesson(day = day)
        }
        Column(Modifier.weight(1f)) {
            IconSearch()
        }
        Column(Modifier.weight(1f)) {
            IconList()
        }
        Column(Modifier.weight(1f)) {
            IconBell()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun TopicLessonsPreview() {
    TopicLessons(day = "1 June")
}
