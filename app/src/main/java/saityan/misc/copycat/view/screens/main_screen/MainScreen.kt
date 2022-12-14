package saityan.misc.copycat.view.screens.main_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.main_screen.greeting.Greeting
import saityan.misc.copycat.view.screens.main_screen.homework.Homework
import saityan.misc.copycat.view.screens.main_screen.lessons.LessonMain
import saityan.misc.copycat.view.screens.main_screen.timer.TimerCard

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column() {
            Row {
                Greeting(name = "Mike")
            }

            Row(
                modifier = Modifier.padding(top = 30.dp, bottom = 12.dp)
            ) {
                TimerCard()
            }

            Row(modifier = Modifier.padding(vertical = 12.dp)) {
                LessonMain(lessonsCount = 6, subject = "History", timePeriod = "8:00 — 8:45")
            }

            Row(modifier = Modifier.padding(top = 12.dp, bottom = 64.dp)) {
                Homework()
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
