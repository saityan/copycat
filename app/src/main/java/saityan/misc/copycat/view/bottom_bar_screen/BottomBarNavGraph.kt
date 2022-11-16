package saityan.misc.copycat.view.bottom_bar_screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import saityan.misc.copycat.view.screens.favorites_screen.FavoritesScreen
import saityan.misc.copycat.view.screens.lessons_screen.LessonsScreen
import saityan.misc.copycat.view.screens.main_screen.MainScreen
import saityan.misc.copycat.view.screens.subjects_screen.SubjectsScreen

@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreenList.Main.route
    ) {
        composable(route = BottomBarScreenList.Main.route) {
            MainScreen()
        }
        composable(route = BottomBarScreenList.Lessons.route) {
            LessonsScreen()
        }
        composable (route = BottomBarScreenList.Subjects.route) {
            SubjectsScreen()
        }
        composable (route = BottomBarScreenList.Favorite.route) {
            FavoritesScreen()
        }
    }
}
