package saityan.misc.copycat.view.main_screen.greeting

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileIcon() {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Profile",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun ProfileIconPreview() {
    ProfileIcon()
}
