package saityan.misc.copycat.view.main_screen.homework

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import saityan.misc.copycat.ui.theme.Typography

@Composable
fun DaysLeft(daysLeft: Int) {
    Text(
        text = "$daysLeft days left",
        style = Typography.bodySmall
    )
}
