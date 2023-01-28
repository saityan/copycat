package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.R

@Composable
fun HomeworkIcons(icons: List<Int>) {
    if (icons.isNotEmpty()) {
        Row(
            horizontalArrangement = Arrangement.spacedBy((-6).dp)
        ) {
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
                        imageVector = ImageVector.vectorResource(id = returnIconName(it)),
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun HomeworkIconsPreview() {
    HomeworkIcons(icons = listOf(3, 1))
}

private fun returnIconName(number: Int): Int = when (number) {
    2 -> R.drawable.ic_2
    3 -> R.drawable.ic_3
    4 -> R.drawable.ic_4
    else -> R.drawable.ic_1
}
