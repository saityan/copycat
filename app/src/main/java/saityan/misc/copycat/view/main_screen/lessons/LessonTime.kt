package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun LessonTime(lessonTime: String = "8:00 - 8:45") {
    Text(
        text = lessonTime,
        style = Typography.titleSmall
    )
}
