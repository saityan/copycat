package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun DaysLeft(daysLeft: Int) {
    Text(
        text = "$daysLeft days left",
        style = Typography.body1,
        color = if (daysLeft < 4) {
            Color.Red
        } else {
            Color.DarkGray
        }
    )
}
