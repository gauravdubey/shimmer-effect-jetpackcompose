package com.gaurav.shimmereffectdemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gaurav.shimmereffectdemo.component.CounterScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = "counter") {
        composable("counter") {
            CounterScreen(onNavigateBack = { navController.popBackStack() })
        }
    }
}