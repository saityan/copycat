package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TimerHeader(header: String = "Are you ready for exams?") {
    Text(
        text = header,
        color = MaterialTheme.colors.onPrimary
    )
}

@Preview(showBackground = false)
@Composable
private fun TimerHeaderPreview() {
    TimerHeader()
}
