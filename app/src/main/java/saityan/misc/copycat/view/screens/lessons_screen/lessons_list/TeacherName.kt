package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun TeacherName(teacherName: String) {
    Text(
        text = "Teacher: $teacherName",
        style = Typography.subtitle1
    )
}
