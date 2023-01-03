package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimerBody() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                NumberBox(number = 1)
                NumberBox(number = 0)
            }
            Spacer(Modifier.height(16.dp))

            Text(
                text = "Days",
                color = MaterialTheme.colors.onPrimary
            )
            Spacer(Modifier.height(16.dp))
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                NumberBox(number = 0)
                NumberBox(number = 0)
            }
            Spacer(Modifier.height(16.dp))

            Text(
                text = "Hours",
                color = MaterialTheme.colors.onPrimary
            )
            Spacer(Modifier.height(16.dp))
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                NumberBox(number = 0)
                NumberBox(number = 0)
            }
            Spacer(Modifier.height(16.dp))

            Text(
                text = "Minutes",
                color = MaterialTheme.colors.onPrimary
            )
            Spacer(Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun TimerBodyPreview() {
    TimerBody()
}
