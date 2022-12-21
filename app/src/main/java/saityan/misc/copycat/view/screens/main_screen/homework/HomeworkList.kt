package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeworkList() {
    val homework = listOf(
        HomeworkCard("Literature", 2, "Read scenes 1.1-1.12 of The Master and Margarita"),
        //HomeworkCard("Physics", 5, "Learn Newton's law of motion"),
    )
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(all = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(homework) {

        }
    }
}
