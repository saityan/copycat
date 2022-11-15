package saityan.misc.copycat.view.bottom_bar_screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreenList(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreenList(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Classes : BottomBarScreenList(
        route = "classes",
        title = "Classes",
        icon = Icons.Default.Info
    )

    object Subjects : BottomBarScreenList(
        route = "subjects",
        title = "Subjects",
        icon = Icons.Default.List
    )

    object Favorite : BottomBarScreenList(
        route = "favorite",
        title = "Favorite",
        icon = Icons.Default.Favorite
    )
}
