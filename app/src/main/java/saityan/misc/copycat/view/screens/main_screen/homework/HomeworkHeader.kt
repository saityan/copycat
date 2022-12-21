package saityan.misc.copycat.view.screens.main_screen.homework

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
fun HomeworkHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "Homework",
            style = Typography.body1
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun HomeworkHeaderPreview() {
    HomeworkHeader()
}
