package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun LessonHeaderMain(lessonsCount: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 6.dp),
        verticalAlignment = Alignment.Top
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Classes",
                style = Typography.body1
            )
        }

        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = lessonsCountNaming(lessonsCount),
                style = Typography.body2
            )
        }
    }
}

fun lessonsCountNaming(lessonsCount: Int) : String {
    return if (lessonsCount > 1)
        "$lessonsCount classes today"
    else if (lessonsCount == 1)
        "1 class today"
    else
        "No classes today"
}

@Preview(showBackground = false)
@Composable
private fun LessonsHeaderPreview() {
    LessonHeaderMain(6)
}
