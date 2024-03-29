package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Timer(timer: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TimerHeader()
        TimerBody(timer)
    }
}

@Preview(showBackground = false)
@Composable
private fun TimerPreview() {
    Timer("10:00:00")
}
