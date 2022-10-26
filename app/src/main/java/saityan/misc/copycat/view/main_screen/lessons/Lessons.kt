package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Lessons() {
    Row(
        verticalAlignment = Alignment.Top,
    ) {
        LessonsHeader()
    }
}

@Preview(showBackground = false)
@Composable
fun LessonsPreview() {
    Lessons()
}
