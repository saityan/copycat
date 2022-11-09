package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LessonsBody() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            LessonIcon()
        }
        Column {
            LessonDesc()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun LessonsBodyPreview() {
    LessonsBody()
}
