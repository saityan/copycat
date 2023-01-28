package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun VerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.secondary.copy(alpha = 0.8f),
    thickness: Dp = 2.dp,
    isPaired: Boolean = false
) {
    Box(
        modifier
            .offset(y = 18.dp)
            .heightIn(
                if (isPaired)
                    275.dp
                else
                    175.dp
            )
            .width(thickness)
            .background(color = color)
    )
}
