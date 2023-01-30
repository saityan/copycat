package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.R

@Composable
fun VerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.primaryVariant.copy(alpha = 0.3f),
    thickness: Dp = 1.dp,
    isPaired: Boolean = false,
    isCurrent: Boolean = false
) {
    if (isCurrent) {
        Image(
            modifier = Modifier.offset(y = 10.dp),
            imageVector = ImageVector.vectorResource(id = R.drawable.utility_dot_large),
            contentDescription = null,
            alpha = 0.8f
        )
    } else {
        Image(
            modifier = Modifier.offset(y = 10.dp),
            imageVector = ImageVector.vectorResource(id = R.drawable.utility_dot_small),
            contentDescription = null,
            alpha = 0.8f
        )
    }

    Box(
        modifier = modifier
            .offset(y = 10.dp)
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
