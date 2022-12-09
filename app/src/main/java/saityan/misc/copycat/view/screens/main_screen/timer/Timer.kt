package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Timer() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TimerHeader()
        Spacer(Modifier.height(16.dp))
        TimerBody()
    }
}

@Preview(showBackground = false)
@Composable
private fun TimerPreview() {
    Timer()
}
