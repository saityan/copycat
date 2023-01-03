package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
    Box(
        modifier = Modifier
            .graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 6.dp,
                    topEnd = 6.dp,
                    bottomStart = 6.dp,
                    bottomEnd = 6.dp
                )
                clip = true
            }
            .background(
                color = MaterialTheme.colors.onSurface
            )
            .height(40.dp)
            .width(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = if (number > -1 && number < 10)
                number.toString()
            else "0",
            color = MaterialTheme.colors.onPrimary,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
@Preview(showBackground = false)
private fun NumberBoxPreview() {
    NumberBox(number = -1)
}
