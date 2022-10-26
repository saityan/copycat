package saityan.misc.copycat.view.main_screen.timer

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TimerHeader(header: String = "Are you ready for exams?") {
    Text(
        text = header,
        color = MaterialTheme.colorScheme.onPrimary
    )
}

@Preview(showBackground = false)
@Composable
fun TimerHeaderPreview() {
    TimerHeader()
}
