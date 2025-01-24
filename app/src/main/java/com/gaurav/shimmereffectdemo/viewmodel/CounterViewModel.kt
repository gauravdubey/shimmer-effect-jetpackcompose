package com.gaurav.shimmereffectdemo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {
    private val _counter = MutableStateFlow(0)
    val counter: StateFlow<Int> = _counter

    init {
        // Simulate periodic updates
        viewModelScope.launch {
            while (true) {
                delay(1000)
                _counter.value += 1
            }
        }
    }

    override
    fun onCleared() {
        super.onCleared()
        println("ViewModel cleared: Resources cleaned up!")
    }

}