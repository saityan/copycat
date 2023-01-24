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
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.common.ButtonOpenIn
import saityan.misc.copycat.view.screens.common.VerticalDivider

@Composable
fun LessonCard(
    subject: String,
    teacher: String,
    timePeriod: String,
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
            VerticalDivider()
        }

        Column(
            modifier = Modifier.weight(8.5f)
        ) {
            Row {
                LessonTimePeriod(timePeriod = timePeriod)
            }
            Spacer(modifier = Modifier.height(6.dp))

            if (isPaired) {
                GetPairedCard(subject = subject, teacher = teacher, isOpenedIn = isOpenedIn)
            } else {
                GetSingularCard(subject = subject, teacher = teacher, isOpenedIn = isOpenedIn)
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun LessonCardPreview() {
    LessonCard(subject = "History", teacher = "Mrs Thomas", timePeriod = "8:00 - 8:45")
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
        CardContent(subject = subject, teacher = teacher, isOpenedIn = isOpenedIn)
    }
}

@Composable
private fun GetPairedCard(
    subject: String,
    teacher: String,
    isOpenedIn: Boolean
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
        CardContent(subject = subject, teacher = teacher, isOpenedIn = isOpenedIn)
    }
}

@Composable
private fun CardContent(subject: String, teacher: String, isOpenedIn: Boolean) {
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
