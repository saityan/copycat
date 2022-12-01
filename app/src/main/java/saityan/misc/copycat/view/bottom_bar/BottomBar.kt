package saityan.misc.copycat.view.bottom_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import saityan.misc.copycat.ui.theme.Gray

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
        modifier = Modifier.
            graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp
                )
            }
            .background(
                color = Gray
            )
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
