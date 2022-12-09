package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OpenInLesson() {
    Button(
        modifier = Modifier.background(
            color = MaterialTheme.colors.secondaryVariant
        ),
        onClick = { /*TODO*/ }
    ) {
        Column {
            Text(
                modifier = Modifier.rotate(90f),
                text = "Open in",
                style = MaterialTheme.typography.subtitle2
            )

            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                tint = MaterialTheme.colors.onPrimary
            )
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun OpenInLessonPreview() {
    OpenInLesson()
}
