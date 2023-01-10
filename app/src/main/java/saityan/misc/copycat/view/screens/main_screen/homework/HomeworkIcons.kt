package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.R

@Composable
fun HomeworkIcons(icons: List<Int>) {
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
                        .background(color = returnColor(number = it))
                ) {
                    IconButton(onClick = { /*Action*/ }) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = returnIconName(it)),
                            contentDescription = "",
                            tint = MaterialTheme.colors.onSecondary
                        )
                    }
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

@Composable
private fun returnColor(number: Int): Color = when (number) {
    2 -> MaterialTheme.colors.secondary
    3 -> MaterialTheme.colors.secondaryVariant
    4 -> MaterialTheme.colors.secondary
    else -> MaterialTheme.colors.secondaryVariant
}
