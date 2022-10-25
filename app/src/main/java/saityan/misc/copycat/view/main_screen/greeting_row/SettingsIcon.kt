package saityan.misc.copycat.view.main_screen.greeting_row

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsIcon() {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Settings",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}
