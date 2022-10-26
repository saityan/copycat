package saityan.misc.copycat.view.main_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.main_screen.greeting.GreetingsRow
import saityan.misc.copycat.view.main_screen.timer.Timer

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {

            GreetingsRow(name = "Mike")

            Spacer(Modifier.height(32.dp))

            Timer()

            Spacer(Modifier.height(32.dp))

            Row(
                verticalAlignment = Alignment.Top,
            ) {
                Classes()
            }
        }
    }
}

@Composable
fun Classes() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Classes",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize
                )
            }
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "6 classes today",
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                )
            }
        }
        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "")
            }
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row() {
                    Text(
                        text = "History",
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    )
                }
                Row() {
                    Text(
                        text = "8:00 – 8:45",
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    )
                }
            }
        }
    }
}
