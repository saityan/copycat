package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SubjectIconMain(
    icon: ImageVector = Icons.Default.Star,
    subject: String
) {
    Box(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = icon,
                contentDescription = subject,
                tint = MaterialTheme.colors.onPrimary
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun SubjectIconPreview() {
    SubjectIconMain(subject = "History")
}
