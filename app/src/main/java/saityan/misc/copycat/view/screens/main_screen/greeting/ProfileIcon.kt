package saityan.misc.copycat.view.screens.main_screen.greeting

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import saityan.misc.copycat.R

@Composable
fun ProfileIcon() {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colors.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                modifier = Modifier.padding(2.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_0),
                contentDescription = "Profile",
                tint = Color.Unspecified
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun ProfileIconPreview() {
    ProfileIcon()
}
