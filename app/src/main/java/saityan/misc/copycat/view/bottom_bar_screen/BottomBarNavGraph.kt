package saityan.misc.copycat.view.bottom_bar_screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreenList.Home.route
    ) {
        composable(route = BottomBarScreenList.Home.route) {
            //TODO
        }
    }
}
