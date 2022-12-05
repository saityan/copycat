package saityan.misc.copycat.view.screens.lessons_screen.lessons_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi

@ExperimentalCoilApi
@Composable
fun ListContent() {
    val lessons = listOf(
        LessonCard(subject = "History", teacher = "Mrs Smith", timePeriod = "8:00 - 8:45"),
        LessonCard(subject = "Math", teacher = "Mr Todd", timePeriod = "9:00 - 9:45"),
        LessonCard(subject = "Literature", teacher ="Mrs Stuart" , timePeriod = "10:00 - 10:45")
    )

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(lessons) {
        }
    }
}
