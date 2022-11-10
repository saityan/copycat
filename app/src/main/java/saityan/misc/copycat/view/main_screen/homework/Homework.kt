package saityan.misc.copycat.view.main_screen.homework

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Homework() {
    Row(verticalAlignment = Alignment.Top) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 6.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            HomeworkHeader()

            HomeworkBody()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun HomeworkPreview() {
    Homework()
}
