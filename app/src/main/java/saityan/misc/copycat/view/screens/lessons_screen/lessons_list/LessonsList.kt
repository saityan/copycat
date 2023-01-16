package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.runtime.Composable
import coil.annotation.ExperimentalCoilApi

@ExperimentalCoilApi
@Composable
fun LessonsList() {
    listOf(
        LessonCard(
            subject = "History",
            teacher = "Mrs Thomas",
            timePeriod = "8:00 - 8:45"
        ),

        LessonCard(
            subject = "Literature",
            teacher = "Mrs Barros",
            timePeriod = "9:00 - 9:45",
            isOpenedIn = false
        ),

        LessonCard(
            subject = "Physical Education",
            teacher ="Mr Barros",
            timePeriod = "10:00 - 11:35",
            isOpenedIn = false)
    )
}
