package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.main_screen.lessons.LessonIconMain
import saityan.misc.copycat.view.screens.main_screen.lessons.LessonNameMain

@Composable
fun HomeworkLessonHeader(
    lessonName: String = "Literature",
    daysLeft: Int = 2
) {
    Row() {
        Column(modifier = Modifier.padding(3.dp)) {

            LessonNameMain(lessonName = lessonName)

            DaysLeft(daysLeft = daysLeft)
        }

        Column(modifier = Modifier.padding(3.dp)) {

            LessonIconMain(subjectName = "History")

        }
    }
}

@Preview(showBackground = false)
@Composable
fun HomeworkLessonHeaderPreview() {
    HomeworkLessonHeader()
}
