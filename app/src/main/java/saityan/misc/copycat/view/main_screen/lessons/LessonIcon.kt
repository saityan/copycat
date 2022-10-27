package saityan.misc.copycat.view.main_screen.lessons

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LessonIcon(
    icon: ImageVector = Icons.Default.Star,
    subjectName: String = "History"
) {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = icon,
                contentDescription = subjectName,
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun LessonIconPreview() {
    LessonIcon()
}
