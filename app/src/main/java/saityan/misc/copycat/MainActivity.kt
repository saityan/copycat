package saityan.misc.copycat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import saityan.misc.copycat.ui.theme.CopycatTheme
import saityan.misc.copycat.view.bottom_bar_screen.BottomBarScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HideBars()

            CopycatTheme {

                BottomBarScreen()

            }
        }
    }
}

@Composable
fun HideBars() {
    val systemUiController: SystemUiController = rememberSystemUiController()
    systemUiController.isSystemBarsVisible = false
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    CopycatTheme {
        BottomBarScreen()
    }
}
