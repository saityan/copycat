package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Homework() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 6.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        HomeworkHeader()

        HomeworkList()
        Spacer(modifier = Modifier.height(50.dp))
    }
}

@Preview(showBackground = false)
@Composable
private fun HomeworkPreview() {
    Homework()
}
