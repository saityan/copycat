package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun TeacherName(
    teacherName: String,
    isPairedLesson: Boolean = false
) {
    Text(
        modifier = Modifier.padding(top = 6.dp),
        text = "Teacher: $teacherName",
        style = Typography.subtitle1,
        color =
            if (isPairedLesson) {
                MaterialTheme.colors.onPrimary.copy(alpha = 0.8f)
            } else {
                MaterialTheme.typography.subtitle2.color
            }
    )
}
