package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LessonsBody() {
    Row(modifier = Modifier.fillMaxWidth()) {
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
