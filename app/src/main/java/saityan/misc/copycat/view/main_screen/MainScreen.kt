package saityan.misc.copycat.view.main_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import saityan.misc.copycat.view.main_screen.greeting.Greeting
import saityan.misc.copycat.view.main_screen.homework.Homework
import saityan.misc.copycat.view.main_screen.lessons.Lessons
import saityan.misc.copycat.view.main_screen.timer.Timer

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Greeting(name = "Mike")

            Timer()

            Lessons()

            Homework()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
