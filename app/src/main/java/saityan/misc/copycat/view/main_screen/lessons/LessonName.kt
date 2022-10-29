package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun LessonName(lessonName: String = "History") {
    Text(
        text = lessonName,
        style = Typography.titleMedium
    )
}
