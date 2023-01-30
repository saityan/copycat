package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.common.LOREM_IPSUM

@Composable
fun LessonCard(
    subject: String,
    teacher: String,
    timePeriod: String,
    desc: String = "",
    isOpenedIn: Boolean = true,
    isPaired: Boolean = false,
    isCurrent: Boolean = false
) {
    Row(
        modifier = Modifier
            .padding(end = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1.5f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            VerticalDivider(
                isPaired = isPaired,
                isCurrent = isCurrent
            )
        }

        Column(
            modifier = Modifier.weight(8.5f)
        ) {
            Row(
                modifier = Modifier
                    .offset(y = if (isCurrent) 10.dp else 0.dp)
            ) {
                LessonTimePeriod(timePeriod = timePeriod)
            }
            Spacer(modifier = Modifier.height(6.dp))

            if (isPaired) {
                LessonCardPaired(subject = subject, teacher = teacher, desc = desc)
            } else {
                LessonCardSingular(subject = subject, teacher = teacher, isOpenedIn = isOpenedIn)
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun LessonCardPreview() {
    Column {
        listOf(
            LessonCard(
                subject = "History",
                teacher = "Mrs Thomas",
                timePeriod = "8:00 - 8:45"
            ),
            LessonCard(
                subject = "Physics",
                teacher = "Mr Whatever", timePeriod = "13:00 - 13: 45",
                isPaired = true,
                desc = LOREM_IPSUM
            ),
        )
    }
}
