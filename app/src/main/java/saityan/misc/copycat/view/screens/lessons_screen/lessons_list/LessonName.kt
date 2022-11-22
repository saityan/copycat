package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

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
