package saityan.misc.copycat.view.screens.lessons_screen.topic

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LessonsTopic(
    day: String
) {
    Row (
        modifier = Modifier.padding(6.dp),
        verticalAlignment = Alignment.Top,
    ) {
        Column(Modifier.weight(7f)) {
            LessonTopicText(day = day)
        }
        Column(Modifier.weight(1f)) {
            SearchIcon()
        }
        Column(Modifier.weight(1f)) {
            ListIcon()
        }
        Column(Modifier.weight(1f)) {
            BellIcon()
        }
    }
    Spacer(Modifier.height(32.dp))
}

@Preview(showBackground = false)
@Composable
fun GreetingRowPreview() {
    LessonsTopic(day = "1 June")
}
