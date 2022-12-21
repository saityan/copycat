package saityan.misc.copycat.view.screens.main_screen.greeting

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun GreetingText(string: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(start = 6.dp)
    ) {
        Text(
            text = string,
            style = Typography.h5
        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    GreetingText(string = "Hi, Mike!")
}
