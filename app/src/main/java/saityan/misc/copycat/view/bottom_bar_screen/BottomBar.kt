package saityan.misc.copycat.view.bottom_bar_screen

import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreenList.Home,
        BottomBarScreenList.Classes,
        BottomBarScreenList.Subjects,
        BottomBarScreenList.Favorite
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val destination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach {
                screen ->
            AddItem(
                screen = screen,
                destination = destination,
                navController = navController
            )
        }
    }
}
