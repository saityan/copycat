package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimerHeader(header: String = "Are you ready for exams?") {
    Row(
        modifier = Modifier.padding(top = 24.dp, bottom = 18.dp)
    ) {
        Text(
            text = header,
            color = MaterialTheme.colors.onPrimary,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun TimerHeaderPreview() {
    TimerHeader()
}
