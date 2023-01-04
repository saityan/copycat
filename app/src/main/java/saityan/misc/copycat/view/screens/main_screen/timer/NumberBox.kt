package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NumberBox(number: Int) {
    Column(
        modifier = Modifier.padding(2.dp)
    ) {
        Box(
            modifier = Modifier
                .graphicsLayer {
                    shape = RoundedCornerShape(
                        topStart = 8.dp,
                        topEnd = 8.dp,
                        bottomStart = 8.dp,
                        bottomEnd = 8.dp
                    )
                    clip = true
                }
                .background(
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
                )
                .height(48.dp)
                .width(34.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (number > -1 && number < 10)
                    number.toString()
                else "0",
                color = MaterialTheme.colors.onPrimary,
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun NumberBoxPreview() {
    NumberBox(number = -1)
}
