package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OpenInLesson() {
    Button(
        modifier = Modifier
            .vertical()
            .rotate(90f)
            .background(MaterialTheme.colors.secondaryVariant),
        shape = RoundedCornerShape(
            topStart = 32.dp,
            topEnd = 32.dp
        ),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        elevation = null,
        onClick = { /*TODO*/ },
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(end = 4.dp),
                text = "Open in",
                style = MaterialTheme.typography.body2
            )

            Icon(
                modifier = Modifier.rotate(-90f),
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "",
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

fun Modifier.vertical() =
    layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        layout(placeable.height, placeable.width) {
            placeable.place(
                x = -(placeable.width / 2 - placeable.height / 2),
                y = -(placeable.height / 2 - placeable.width / 2)
            )
        }
    }
