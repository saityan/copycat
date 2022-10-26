package saityan.misc.copycat.view.main_screen.timer

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Timer() {
    Row(verticalAlignment = Alignment.Top) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TimerHeader()

            TimerBody()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun TimerPreview() {
    Timer()
}
