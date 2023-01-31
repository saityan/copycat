package saityan.misc.copycat.view.screens.main_screen.timer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class TimerModel {
    var formattedTime by mutableStateOf("00:00:00")

    private var coroutineScope = CoroutineScope(Dispatchers.Main)

    private var time = 0L

    private var lastTimestamp = 0L

    fun start() {
        coroutineScope.launch {
            lastTimestamp = System.currentTimeMillis()
            delay(1000L)
            time += System.currentTimeMillis() - lastTimestamp
            lastTimestamp = System.currentTimeMillis()
            formattedTime = formatTime(time)
        }
    }

    private fun formatTime(time: Long): String {
        val localDateTime = LocalDateTime.ofInstant(
            Instant.ofEpochMilli(time),
            ZoneId.systemDefault()
        )
        val formatter = DateTimeFormatter.ofPattern(
            "hh:mm:ss",
            Locale.getDefault()
        )
        return localDateTime.format(formatter)
    }
}
