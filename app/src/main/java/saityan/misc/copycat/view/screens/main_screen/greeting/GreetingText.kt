package saityan.misc.copycat.view.screens.main_screen.greeting

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun GreetingText(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(start = 6.dp)
    ) {
        Row {
            Text(
                text = "Hi, ",
                style = Typography.h5
            )

            Text(
                text = "${name}!",
                style = Typography.h5,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    GreetingText(name = "Mike")
}
