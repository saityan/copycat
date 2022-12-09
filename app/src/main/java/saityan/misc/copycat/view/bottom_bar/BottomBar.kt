package saityan.misc.copycat.view.bottom_bar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
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

    BottomNavigation(
        backgroundColor = Color.DarkGray,
        contentColor = Color.White,
        modifier = Modifier
            .graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp
                )
                clip = true
            }
    ) {
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
