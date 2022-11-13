package saityan.misc.copycat.view.bottom_bar_screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Classes : BottomBarScreen(
        route = "classes",
        title = "Classes",
        icon = Icons.Default.Settings
    )

    object Subjects : BottomBarScreen(
        route = "subjects",
        title = "Subjects",
        icon = Icons.Default.Person
    )

    object Favorite : BottomBarScreen(
        route = "favorite",
        title = "Favorite",
        icon = Icons.Default.Settings
    )
}
