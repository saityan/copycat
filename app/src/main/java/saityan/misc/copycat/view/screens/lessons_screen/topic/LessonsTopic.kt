package saityan.misc.copycat.view.screens.lessons_screen.topic

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LessonsTopic(
    lesson: String
) {
    Row (
        modifier = Modifier.padding(6.dp),
        verticalAlignment = Alignment.Top,
    ) {
        Column(Modifier.weight(7f)) {
            LessonTopicText(string = "Hi, ${lesson}!")
        }
        Column(Modifier.weight(1f)) {
            SearchIcon()
        }
        Column(Modifier.weight(1f)) {
            SettingsIcon()
        }
        Column(Modifier.weight(1f)) {
            ProfileIcon()
        }
    }
    Spacer(Modifier.height(32.dp))
}

@Preview(showBackground = false)
@Composable
fun GreetingRowPreview() {
    LessonsTopic(lesson = "Mike")
}
