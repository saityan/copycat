package saityan.misc.copycat.view.main_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.main_screen.greeting.Greeting
import saityan.misc.copycat.view.main_screen.lessons.Lessons
import saityan.misc.copycat.view.main_screen.timer.Timer

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Greeting(name = "Mike")
            Spacer(Modifier.height(32.dp))

            Timer()
            Spacer(Modifier.height(32.dp))

            Lessons()
            Spacer(Modifier.height(32.dp))
        }
    }
}
