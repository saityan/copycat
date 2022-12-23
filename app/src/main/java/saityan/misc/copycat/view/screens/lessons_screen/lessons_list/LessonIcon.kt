package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.common.getIconBySubject

@Composable
fun LessonIcon(subject: String) {
    Box(
        modifier = Modifier
            .graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 24.dp,
                    topEnd = 24.dp,
                    bottomStart = 24.dp,
                    bottomEnd = 24.dp
                )
                clip = true
            }
            .height(48.dp)
            .width(48.dp)
            .background(color = MaterialTheme.colors.onSurface)
    ) {
        Icon(
            modifier = Modifier.padding(12.dp),
            painter = painterResource(id = getIconBySubject(subject)),
            contentDescription = subject,
            tint = MaterialTheme.colors.onPrimary
        )
    }
}

@Preview(showBackground = false)
@Composable
private fun LessonIconPreview() {
    LessonIcon(subject = "Literature")
}
