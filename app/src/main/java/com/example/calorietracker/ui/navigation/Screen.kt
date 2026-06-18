/**
 * Class defining the app's navigation screens and its directory routes.
 */

package com.example.calorietracker.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.calorietracker.R

/**
 * Define the bottom navigation bar buttons
 * Home, Track, Cook, Progress
 */
sealed class Screen(val route: String) {

    sealed class NavigationTabs(
        route: String,
        val title: String,
        val icon: @Composable () -> Unit
    ): Screen(route) {

        object Destinations {
            // Home Button
            object Home: NavigationTabs(
                route = "home",
                title = "Home",
                icon = {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.home_button_icon
                        ),
                        contentDescription = "Home",
                        tint = Color.Black)
                }
            )

            // Track Button
            object Track: NavigationTabs(
                route = "track",
                title = "Track",
                icon = {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.track_button_icon
                        ),
                        contentDescription = "Track",
                        tint = Color.Black
                    )
                }
            )

            // Cook Button
            object Cook: NavigationTabs(
                route = "cook",
                title = "Cook",
                icon = {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.cook_button_icon
                        ),
                        contentDescription = "Cook",
                        tint = Color.Black
                    )
                }
            )

            // Progress Button
            object Progress: NavigationTabs(
                route = "progress",
                title = "Progress",
                icon = {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.progress_button_icon
                        ),
                        contentDescription = "Progress",
                        tint = Color.Black
                    )
                }
            )

        }
    }


}