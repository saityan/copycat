package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.R

@Composable
fun IconsForPairedLesson(icons: List<Int>) {
    if (icons.isNotEmpty()) {
        Row {
            icons.forEach {
                Box(
                    modifier = Modifier
                        .graphicsLayer {
                            shape = RoundedCornerShape(
                                topStart = 32.dp,
                                topEnd = 32.dp,
                                bottomStart = 32.dp,
                                bottomEnd = 32.dp
                            )
                            clip = true
                        }
                        .height(32.dp)
                        .width(32.dp)
                        .background(color = MaterialTheme.colors.secondary.copy(alpha = 0.8f))
                ) {
                    Image(
                        modifier = Modifier.padding(2.dp),
                        imageVector = ImageVector.vectorResource(id = returnIconName(it)),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun LessonPairedIconsPreview() {
    IconsForPairedLesson(listOf(1, 2, 3))
}

private fun returnIconName(number: Int): Int = when (number) {
    1 -> R.drawable.ic_basc_skills
    2 -> R.drawable.ic_basc_magister
    3 -> R.drawable.ic_basc_training
    else -> R.drawable.ic_hands
}
