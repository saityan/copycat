package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
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
    Box(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = icon,
                contentDescription = subjectName,
                tint = MaterialTheme.colors.onPrimary
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun LessonIconPreview() {
    LessonIcon()
}
