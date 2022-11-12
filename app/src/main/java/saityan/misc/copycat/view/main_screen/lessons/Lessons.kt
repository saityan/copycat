package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Lessons() {
    Row(verticalAlignment = Alignment.Top) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 6.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LessonsHeader()

            LessonsBody()
        }
    }
    Spacer(Modifier.height(32.dp))
}

@Preview(showBackground = false)
@Composable
fun LessonsPreview() {
    Lessons()
}
