package com.gaurav.shimmereffectdemo.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.gaurav.shimmereffectdemo.viewmodel.CounterViewModel

@Composable
fun CounterScreen(onNavigateBack: () -> Unit) {
    val counterViewModel: CounterViewModel = viewModel()
    val count by counterViewModel.counter.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNavigateBack) {
            Text("Back")
        }
    }
}