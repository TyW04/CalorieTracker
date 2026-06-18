/**
 * BottomNavigationBar
 *
 * Composable component defining the navigation bar at the bottom of the app.
 *
 */
package com.example.calorietracker.ui.components

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.calorietracker.ui.navigation.Screen

@Composable
fun BottomNavigationBar(currentRoute: String = "Home") {
    NavigationBar(containerColor = Color(0xFFFCDFC3)) {
        // Home Button
        NavigationBarItem(
            icon = Screen.NavigationTabs.Destinations.Home.icon,
            selected = (currentRoute ==
                    Screen.NavigationTabs.Destinations.Home.route),
            label = { Text("Home") },
            onClick = { /* TODO: Add function to load the Home screen */ }
        )

        // Track Button
        NavigationBarItem(
            icon = Screen.NavigationTabs.Destinations.Track.icon,
            selected = (currentRoute ==
                    Screen.NavigationTabs.Destinations.Home.route),
            label = { Text("Track") },
            onClick = { /* TODO: Add function to load the Track screen */ }
        )

        // Cook Button
        NavigationBarItem(
            icon = Screen.NavigationTabs.Destinations.Cook.icon,
            selected = (currentRoute ==
                    Screen.NavigationTabs.Destinations.Cook.route),
            label = { Text("Cook") },
            onClick = { /* TODO: Add function to load the Cook screen */ }
        )

        // Progress Button
        NavigationBarItem(
            icon = Screen.NavigationTabs.Destinations.Progress.icon,
            selected = (currentRoute ==
                    Screen.NavigationTabs.Destinations.Progress.route),
            label = { Text("Progress") },
            onClick = { /* TODO: Add function to load the Progress screen */ }
        )
    }
}