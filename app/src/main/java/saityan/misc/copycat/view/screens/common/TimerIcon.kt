package saityan.misc.copycat.view.screens.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.R
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun TimerIcon(color: Color, paddingTop: Int) {
    Box(
        modifier = Modifier
            .padding(top = paddingTop.dp)
            .size(12.dp)
            .background(color = Color.Transparent)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_clock),
            contentDescription = "",
            tint = color
        )
    }
}

@Composable
@Preview
private fun TimerIconPreview() {
    TimerIcon(Typography.subtitle2.color, 12)
}
