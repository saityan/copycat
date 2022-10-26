package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LessonsHeader() {
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
    }
}

@Preview(showBackground = false)
@Composable
fun LessonsHeaderPreview() {
    LessonsHeader()
}
