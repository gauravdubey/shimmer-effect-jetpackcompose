package com.gaurav.shimmereffectdemo.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.gaurav.shimmereffectdemo.R

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolBar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.lable_product_list),
            color = Color.White,
            fontSize = 16.sp) },
        navigationIcon = {
            IconButton(onClick = { /* Handle navigation */ }) {
                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.White)
            }
        },
        actions = {
            IconButton(onClick = { /* Handle search */ }) {
                Icon(Icons.Default.Search, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = { /* Handle more options */ }) {
                Icon(
                    Icons.Default.MoreVert,
                    contentDescription = "More options",
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF6200EA), // Toolbar background color
            titleContentColor = Color.White // Title text color
        )

//                elevation = 8.dp // Elevation of the toolbar
    )
}