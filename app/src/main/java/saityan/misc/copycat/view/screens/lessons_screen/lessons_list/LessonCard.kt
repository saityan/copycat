package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.view.screens.common.ButtonOpenIn

@Composable
fun LessonCard(
    subject: String,
    teacher: String,
    timePeriod: String
) {
    Row(
        modifier = Modifier.padding(bottom = 12.dp)
    ) {
        Column(
            modifier = Modifier.weight(1.5f)
        ) {

        }

        Column(
            modifier = Modifier.weight(8.5f)
        ) {
            Row {
                LessonTimePeriod(timePeriod = timePeriod)
            }
            Spacer(modifier = Modifier.height(6.dp))

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp, horizontal = 6.dp)
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
                    Lesson(subject, teacher)

                    ButtonOpenIn()
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun LessonCardPreview() {
    LessonCard(subject = "History", teacher = "Mrs Thomas", timePeriod = "8:00 - 8:45")
}
