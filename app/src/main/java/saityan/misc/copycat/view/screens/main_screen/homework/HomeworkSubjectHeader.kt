package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.main_screen.lessons.SubjectIconMain
import saityan.misc.copycat.view.screens.main_screen.lessons.SubjectMain

@Composable
fun HomeworkSubjectHeader(
    subject: String,
    daysLeft: Int
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.padding(3.dp)) {

            SubjectMain(lessonName = subject)

            DaysLeft(daysLeft = daysLeft)
        }

        Column(modifier = Modifier.padding(3.dp)) {

            SubjectIconMain(subject = subject)

        }
    }
}

@Preview(showBackground = false)
@Composable
private fun HomeworkSubjectHeaderPreview() {
    HomeworkSubjectHeader("Literature", 2)
}
