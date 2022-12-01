package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun LessonName(lessonName: String = "History") {
    Text(
        text = lessonName,
        style = Typography.subtitle1
    )
}