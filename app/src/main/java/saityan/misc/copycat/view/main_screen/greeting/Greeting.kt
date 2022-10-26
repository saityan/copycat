package saityan.misc.copycat.view.main_screen.greeting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GreetingsRow(
    name: String
) {
    Row (
        verticalAlignment = Alignment.Top,
    ) {
        Column(Modifier.weight(7f)) {
            Greeting(string = "Hi, ${name}!")
        }
        Column(Modifier.weight(1f)) {
            SearchIcon()
        }
        Column(Modifier.weight(1f)) {
            SettingsIcon()
        }
        Column(Modifier.weight(1f)) {
            ProfileIcon()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingRowPreview() {
    GreetingsRow(name = "Mike")
}
