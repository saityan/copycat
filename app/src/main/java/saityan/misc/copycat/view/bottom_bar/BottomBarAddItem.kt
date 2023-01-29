package saityan.misc.copycat.view.bottom_bar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreenList,
    destination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(
                text = screen.title,
                color = if (checkDestination(destination, screen)) {
                    MaterialTheme.colors.secondary.copy(alpha = ContentAlpha.high)
                } else {
                    MaterialTheme.colors.onPrimary.copy(alpha = ContentAlpha.medium)
                }
            )
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation"
            )
        },
        selected = checkDestination(destination, screen),
        unselectedContentColor = MaterialTheme.colors.onPrimary.copy(alpha = ContentAlpha.medium),
        selectedContentColor = MaterialTheme.colors.secondary.copy(alpha = ContentAlpha.high),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}

@Composable
private fun checkDestination(
    destination: NavDestination?,
    screen: BottomBarScreenList
) = destination?.hierarchy?.any {
    it.route == screen.route
} == true
