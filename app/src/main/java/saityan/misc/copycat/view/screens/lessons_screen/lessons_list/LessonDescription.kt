package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import saityan.misc.copycat.ui.theme.Typography
import saityan.misc.copycat.view.screens.common.LOREM_IPSUM

@Composable
fun LessonDescription(desc: String) {
    Text(
        text = desc,
        style = Typography.subtitle1,
        color = MaterialTheme.colors.onPrimary.copy(alpha = 0.8f)
    )
}

@Composable
@Preview
private fun LessonDescriptionPreview() {
    LessonDescription(
        desc = LOREM_IPSUM
    )
}
