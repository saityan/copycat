package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.runtime.Composable
import coil.annotation.ExperimentalCoilApi
import saityan.misc.copycat.view.screens.common.PHYS_EDUC_DEMO

@ExperimentalCoilApi
@Composable
fun LessonsListSample() {
    listOf(
        LessonCard(
            subject = "History",
            teacher = "Mrs Thomas",
            timePeriod = "8:00 - 8:45",
            isCurrent = true,
        ),

        LessonCard(
            subject = "Literature",
            teacher = "Mrs Barros",
            timePeriod = "9:00 - 9:45",
            isOpenedIn = false,
        ),

        LessonCard(
            subject = "Physical Education",
            teacher ="Mr Barros",
            timePeriod = "10:00 - 11:35",
            desc = PHYS_EDUC_DEMO,
            isOpenedIn = false,
            isPaired = true,
        ),

        LessonCard(
            subject = "Physics",
            teacher ="Mr Livingston",
            timePeriod = "12:00 - 13:30",
        ),
    )
}
