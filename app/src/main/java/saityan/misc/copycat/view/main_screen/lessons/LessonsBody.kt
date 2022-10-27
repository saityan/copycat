package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LessonsBody() {
    Row(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            LessonIcon()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun LessonsBodyPreview() {
    LessonsBody()
}
