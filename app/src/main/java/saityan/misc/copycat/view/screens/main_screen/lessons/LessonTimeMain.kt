package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.ui.theme.Typography
import saityan.misc.copycat.view.screens.common.TimerIcon

@Composable
fun LessonTimeMain(lessonTime: String) {
    Row {
        TimerIcon(Typography.subtitle2.color, 12)

        Text(
            modifier = Modifier
                .padding(vertical = 9.dp)
                .padding(horizontal = 6.dp),
            text = lessonTime,
            style = Typography.subtitle2,
        )
    }
}

@Composable
@Preview(showBackground = false)
private fun LessonTimeMain() {
    LessonTimeMain(lessonTime = "10:00 - 10:45")
}
