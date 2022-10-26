package saityan.misc.copycat.view.main_screen.greeting

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun Greeting(string: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
    ) {
        Text(
            text = string,
            style = Typography.headlineMedium
        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    Greeting(string = "Hi, Mike!")
}
