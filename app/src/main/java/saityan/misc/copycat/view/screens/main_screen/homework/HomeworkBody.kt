package saityan.misc.copycat.view.screens.main_screen.homework

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeworkBody(desc: String, icon: Int) {
    Column() {
        Text(
            text = desc,
            style = MaterialTheme.typography.subtitle2
        )


    }
}
