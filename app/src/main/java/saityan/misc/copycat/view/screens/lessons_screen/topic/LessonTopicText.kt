package saityan.misc.copycat.view.screens.lessons_screen.topic

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun LessonTopicText(string: String) {
    Surface(
        color = MaterialTheme.colors.primary,
    ) {
        Text(
            text = "Classes",
            style = Typography.body1
        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    LessonTopicText(string = "Classes")
}
