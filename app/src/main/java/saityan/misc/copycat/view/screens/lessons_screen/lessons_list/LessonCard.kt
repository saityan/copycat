package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.common.ButtonOpenIn
import saityan.misc.copycat.view.screens.common.LOREM_IPSUM

@Composable
fun LessonCard(
    subject: String,
    teacher: String,
    timePeriod: String,
    desc: String = "",
    isOpenedIn: Boolean = true,
    isPaired: Boolean = false
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
            VerticalDivider(isPaired = isPaired)
        }

        Column(
            modifier = Modifier.weight(8.5f)
        ) {
            Row {
                LessonTimePeriod(timePeriod = timePeriod)
            }
            Spacer(modifier = Modifier.height(6.dp))

            if (isPaired) {
                GetPairedCard(subject = subject, teacher = teacher, desc = desc)
            } else {
                GetSingularCard(subject = subject, teacher = teacher, isOpenedIn = isOpenedIn)
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

@Composable
private fun GetSingularCard(
    subject: String,
    teacher: String,
    isOpenedIn: Boolean
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 6.dp)
            .heightIn(100.dp)
            .graphicsLayer {
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp,
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                )
                clip = true
            },
        color = MaterialTheme.colors.surface,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            LessonBody(subject, teacher)

            ButtonOpenIn(isOpenedIn)
        }
    }
}

@Composable
private fun GetPairedCard(
    subject: String,
    teacher: String,
    desc: String = ""
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 6.dp)
            .heightIn(200.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        MaterialTheme.colors.primaryVariant,
                        MaterialTheme.colors.secondary
                    )
                ),
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp,
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                )
            ),
        color = Color.Transparent
    ) {
        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 6.dp)
                    .padding(top = 24.dp, bottom = 6.dp),
                verticalAlignment = Alignment.Top
            ) {
                LessonBody(
                    subject = subject,
                    teacher = teacher,
                    iconOpacity = 0.2f,
                    isPairedLesson = true
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .padding(start = 18.dp, end = 6.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LessonDescription(desc = desc)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .padding(start = 18.dp, end = 6.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconsForPairedLesson(icons = listOf(1, 2, 3))
            }
        }
    }
}

@Composable
private fun VerticalDivider(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.secondary.copy(alpha = 1f),
    thickness: Dp = 2.dp,
    isPaired: Boolean = false
) {
    Box(
        modifier
            .heightIn(
                if (isPaired)
                    275.dp
                else
                    175.dp
            )
            .width(thickness)
            .background(color = color)
    )
}
