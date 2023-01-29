package saityan.misc.copycat.view.screens.main_screen.greeting

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(
    name: String
) {
    Row(
        verticalAlignment = Alignment.Top,
    ) {
        Column(Modifier
            .weight(5.5f)
        ) {
            GreetingText(name = name)
        }
        Column(Modifier
            .weight(1.5f),
            horizontalAlignment = Alignment.End
        ) {
            SearchIcon()
        }
        Column(Modifier
            .weight(1.5f),
            horizontalAlignment = Alignment.End
        ) {
            SettingsIcon()
        }
        Column(Modifier
            .weight(1.5f)
            .padding(end = 6.dp),
            horizontalAlignment = Alignment.End
        ) {
            ProfileIcon()
        }
    }
    Spacer(Modifier.height(32.dp))
}

@Preview(showBackground = false)
@Composable
fun GreetingRowPreview() {
    Greeting(name = "Mike")
}
