package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeworkCard(
    subject: String,
    daysLeft: Int,
    desc: String,
    icons: List<Int>
) {
    Surface(
        modifier = Modifier
            .padding(6.dp)
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
        Column(
            modifier = Modifier.padding(12.dp),
        ) {
            HomeworkSubjectHeader(subject = subject, daysLeft = daysLeft)

            HomeworkBody(desc, icons)
        }
    }
}

@Composable
@Preview(showBackground = false)
private fun HomeworkCardPreview() {
    HomeworkCard(
        subject = "Literature",
        daysLeft = 2,
        desc = "Read scenes 1.1-1.12 of The Master and Margarita",
        listOf(1, 2)
    )
}
