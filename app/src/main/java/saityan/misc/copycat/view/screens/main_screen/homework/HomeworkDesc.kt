package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeworkDesc(desc: String) {
    Column {
        Text(
            text = desc,
            style = MaterialTheme.typography.subtitle2,
            color = MaterialTheme.colors.onPrimary,
            maxLines = 2
        )
    }
}

@Composable
@Preview(showBackground = false)
private fun HomeworkDescPreview() {
    HomeworkDesc(desc = "This is a text preview")
}
