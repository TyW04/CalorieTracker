package com.example.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.calorietracker.ui.theme.CalorieTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CalorieTrackerTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color(0xFFFFAA57),
                                    Color(0x00000000)
                                )
                            )
                        ),
                    containerColor = Color.Transparent,
                    topBar = { TopBar() },
                    bottomBar = { BottomNavBar() }
                ) { padding ->
                    MainContent(modifier = Modifier.padding(padding))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { }) {
                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowLeft, contentDescription = "Previous day")
                }
                Text(text = "Tue, May 12") // TODO: Replace with actual calendar
                IconButton(onClick = { }) {
                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Next day")
                }
            }
        },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(Icons.Default.Settings, contentDescription = "Settings")
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(Icons.Default.AccountCircle, contentDescription = "Profile")
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            // Transparent so parent gradient can show through
            containerColor = Color.Transparent
        )
    )
}

@Composable
fun BottomNavBar() {
    NavigationBar(
        containerColor = Color(0xFFFCDFC3)
    ) {
        // Home Button
        NavigationBarItem (
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.home_button_icon),
                    contentDescription = "Home")
            },
            selected = true, // TODO: Replace this with something to track if it is selected
            label = { Text("Home") },
            onClick = {}
        )
        // Track Button
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.track_button_icon),
                    contentDescription = "Track")
            },
            selected = false, // TODO: Replace this with something to track if it is selected
            label = { Text("Track") },
            onClick = {}
        )
        // Cook Button
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.cook_button_icon),
                    contentDescription = "Cook"
                )
            },
            selected = false, // TODO: Replace this with something to track if it is selected
            label = { Text("Cook") },
            onClick = {}
        )
        // Progress Button
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.progress_button_icon),
                    contentDescription = "Progress"
                )
            },
            selected = false,
            label = { Text("Progress") },
            onClick = {}
        )
    }

    return
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    // Day overview
    // Meals overview
    // Goals section (if applicable)
    return
}

@Preview(
    name = "Pixel 8",
    showBackground = true,
    device = "id:pixel_8"
)
@Preview(showBackground = true)
@Composable
fun CalorieTrackerPreview() {
    CalorieTrackerTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFFFAA57),
                            Color(0x00000000)
                        )
                    )
                ),
            containerColor = Color.Transparent,
            topBar = { TopBar() },
            bottomBar = { BottomNavBar() }
        ) { padding ->
            MainContent(modifier = Modifier.padding(padding))
        }
    }
}