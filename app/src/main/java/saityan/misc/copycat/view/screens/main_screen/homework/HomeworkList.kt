package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeworkList() {
    Row(modifier = Modifier
        .horizontalScroll(rememberScrollState())
        .fillMaxWidth()) {
        listOf(
            HomeworkCard(
                "Literature",
                2, "Read scenes 1.1-1.12 of The Master and Margarita",
                listOf(1, 2)
            ),
            HomeworkCard(
                "Physics",
                5,
                "Learn Newton's laws of motion",
                listOf(2, 4)
            ),
        )
    }
}
