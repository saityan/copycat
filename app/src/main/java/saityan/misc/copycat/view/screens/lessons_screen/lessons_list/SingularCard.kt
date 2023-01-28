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
fun SingularCard(
    subject: String,
    teacher: String,
    isOpenedIn: Boolean = false
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
@Preview(showBackground = false)
private fun SingularCardPreview() {
    SingularCard(subject = "History", teacher = "Mr Barros")
}
