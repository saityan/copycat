package saityan.misc.copycat.view.screens.main_screen

import android.os.CountDownTimer
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.common.countdown
import saityan.misc.copycat.view.screens.main_screen.greeting.Greeting
import saityan.misc.copycat.view.screens.main_screen.homework.Homework
import saityan.misc.copycat.view.screens.main_screen.lessons.LessonMain
import saityan.misc.copycat.view.screens.main_screen.timer.TimerCard
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun MainScreen() {
    var formattedTime: String by remember {
        mutableStateOf("00:00:00")
    }
    val format = SimpleDateFormat("dd:hh:mm", Locale.getDefault())
    val count = object : CountDownTimer(
        countdown, 60000
    ) {
        override fun onTick(millisUntilFinished: Long) {
            formattedTime = format.format(millisUntilFinished)
        }

        override fun onFinish() {
            formattedTime = format.format(countdown)
        }
    }
    count.start()

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp),
        color = MaterialTheme.colors.background,
    ) {
        Column(
            verticalArrangement = Arrangement.Top
        ) {
            Greeting(name = "Mike")

            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                TimerCard(formattedTime)
                Spacer(modifier = Modifier.height(24.dp))

                LessonMain(lessonsCount = 6, subject = "History", timePeriod = "8:00 — 8:45")
                Spacer(modifier = Modifier.height(12.dp))

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
