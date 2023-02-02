package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimerBody(timer: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                NumberBox(number = timer[0].digitToInt())
                NumberBox(number = timer[1].digitToInt())
            }
            Spacer(Modifier.height(8.dp))

            Text(
                text = "Days",
                color = MaterialTheme.colors.onPrimary,
                fontSize = MaterialTheme.typography.subtitle1.fontSize,
                fontWeight = FontWeight.Normal
            )
            Spacer(Modifier.height(24.dp))
        }

        ColonBox()

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                NumberBox(number = timer[3].digitToInt())
                NumberBox(number = timer[4].digitToInt())
            }
            Spacer(Modifier.height(8.dp))

            Text(
                text = "Hours",
                color = MaterialTheme.colors.onPrimary,
                fontSize = MaterialTheme.typography.subtitle1.fontSize,
                fontWeight = FontWeight.Normal
            )
            Spacer(Modifier.height(24.dp))
        }

        ColonBox()

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                NumberBox(number = timer[6].digitToInt())
                NumberBox(number = timer[7].digitToInt())
            }
            Spacer(Modifier.height(8.dp))

            Text(
                text = "Minutes",
                color = MaterialTheme.colors.onPrimary,
                fontSize = MaterialTheme.typography.subtitle1.fontSize,
                fontWeight = FontWeight.Normal
            )
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun TimerBodyPreview() {
    TimerBody("10:00:00")
}
