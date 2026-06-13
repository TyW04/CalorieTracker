package com.example.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calorietracker.ui.theme.CalorieTrackerTheme
import kotlinx.coroutines.flow.WhileSubscribed

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
    // Home Button
    // Track Button
    // Cook Button
    // Progress Button
    return
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    // Day overview
    // Meals overview
    // Goals section (if applicable)
    return
}

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