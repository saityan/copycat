package saityan.misc.copycat.view.screens.lessons_screen.topic

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun TopicTextLesson(day: String) {
    Surface(
        color = MaterialTheme.colors.primary,
    ) {
        Column {
            Text(
                text = "Classes",
                style = Typography.body1
            )
            Text(
                text = day,
                style = Typography.subtitle2
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    TopicTextLesson(day = "1 June")
}
