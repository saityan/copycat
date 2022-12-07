package saityan.misc.copycat.view.screens.main_screen.lessons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LessonCardMain(
    subject : String,
    timePeriod: String
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp),
        color = MaterialTheme.colors.surface,
    ) {
        LessonsBodyMain(subject = subject, timePeriod = timePeriod)
    }
}
