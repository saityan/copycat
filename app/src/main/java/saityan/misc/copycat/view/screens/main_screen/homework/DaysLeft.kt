package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.ui.theme.Typography
import saityan.misc.copycat.view.screens.common.TimerIcon

@Composable
fun DaysLeft(daysLeft: Int) {
    Row {

        TimerIcon(getValidColor(daysLeft), 3)

        Text(
            modifier = Modifier
                .padding(horizontal = 6.dp),
            text = "$daysLeft days left",
            style = Typography.subtitle2,
            color = getValidColor(daysLeft)
        )
    }
}

private fun getValidColor(daysLeft: Int): Color = if (daysLeft < 4) {
    Color.Red
} else {
    Typography.subtitle2.color
}
