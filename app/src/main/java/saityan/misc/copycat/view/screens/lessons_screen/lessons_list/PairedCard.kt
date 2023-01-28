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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PairedCard(
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
@Preview(showBackground = false)
private fun PairedCardPreview() {
    PairedCard(subject = "Physical Education", teacher = "")
}
