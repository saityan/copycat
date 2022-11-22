package saityan.misc.copycat.view.bottom_bar

import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreenList.Main,
        BottomBarScreenList.Lessons,
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
