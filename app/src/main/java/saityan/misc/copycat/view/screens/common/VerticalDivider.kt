package saityan.misc.copycat.view.screens.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private const val DividerAlpha = 1f

@Composable
fun VerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.secondary.copy(alpha = DividerAlpha),
    thickness: Dp = 2.dp
) {
    Box(
        modifier
            .heightIn(175.dp, 350.dp)
            .width(thickness)
            .background(color = color)
    )
}
