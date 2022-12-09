package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimerCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        MaterialTheme.colors.primary,
                        MaterialTheme.colors.secondary
                    )
                )
            )
            .graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp,
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                )
                clip = true
            },
        color = Color.Transparent
    ) {
        Timer()
    }
}

@Composable
@Preview(showBackground = false)
private fun TimerCardPreview() {
    TimerCard()
}
