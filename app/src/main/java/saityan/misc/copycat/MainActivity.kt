package saityan.misc.copycat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import saityan.misc.copycat.ui.theme.CopycatTheme
import saityan.misc.copycat.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CopycatTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HideBars()
                    Column(
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        Row(
                            verticalAlignment = Alignment.Top,
                        ) {
                            Column(Modifier.weight(7.5f)) {
                                Greeting(string = "Hi, Mike!")
                            }
                            Column(Modifier.weight(1f)) {
                                Search()
                            }
                            Column(Modifier.weight(1f)) {
                                Settings()
                            }
                            Column(Modifier.weight(1f)) {
                                Profile()
                            }
                        }
                        Spacer(Modifier.height(32.dp))

                        Row(
                            verticalAlignment = Alignment.Top,
                        ) {
                            Timer()
                        }
                        Spacer(Modifier.height(32.dp))

                        Row(
                            verticalAlignment = Alignment.Top,
                        ) {
                            Classes()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(string: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
    ) {
        Text(
            text = string,
            style = Typography.headlineMedium
        )
    }
}

@Composable
fun Search() {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun Settings() {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Settings",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun Profile() {
    Surface(
        modifier = Modifier
            .height(32.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.primary,
    ) {
        IconButton(onClick = { /*Action*/ }) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Profile",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun Timer() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Are you ready for exams?",
            color = MaterialTheme.colorScheme.onPrimary
        )
        Spacer(Modifier.height(16.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "10",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                )
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "Days",
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Spacer(Modifier.height(16.dp))
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "00",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                )
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "Hours",
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Spacer(Modifier.height(16.dp))
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "00",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                )
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "Minutes",
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Spacer(Modifier.height(16.dp))
            }
        }
    }
}

@Composable
fun Classes() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Classes",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize
                )
            }
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "6 classes today",
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                )
            }
        }
        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "")
            }
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row() {
                    Text(
                        text = "History",
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    )
                }
                Row() {
                    Text(
                        text = "8:00 – 8:45",
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    )
                }
            }
        }
    }
}

@Composable
fun HideBars() {
    val systemUiController: SystemUiController = rememberSystemUiController()
    systemUiController.isSystemBarsVisible = false
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CopycatTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top,
        ) {
            Column(Modifier.weight(3f)) {
                Greeting(string = "Hi, Mike!")
            }
            Column(Modifier.weight(1f)) {
                Search()
            }
        }
    }
}
