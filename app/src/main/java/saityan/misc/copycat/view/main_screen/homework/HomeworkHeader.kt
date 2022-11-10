package saityan.misc.copycat.view.main_screen.homework

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
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
            .padding(horizontal = 6.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "Homework",
            style = Typography.bodyLarge
        )
    }
}

@Preview(showBackground = false)
@Composable
fun HomeworkHeaderPreview() {
    HomeworkHeader()
}
