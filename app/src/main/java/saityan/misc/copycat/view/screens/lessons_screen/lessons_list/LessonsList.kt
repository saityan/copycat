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
fun LessonsList() {
    val lessons = listOf(
        LessonCard(subject = "History", teacher = "Mrs Thomas", timePeriod = "8:00 - 8:45"),
        LessonCard(subject = "Literature", teacher = "Mrs Barros", timePeriod = "9:00 - 9:45"),
        LessonCard(subject = "Physical Education", teacher ="Mr Barros" , timePeriod = "10:00 - 11:35")
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
