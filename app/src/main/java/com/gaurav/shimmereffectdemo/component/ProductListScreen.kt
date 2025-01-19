package com.gaurav.shimmereffectdemo.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.gaurav.shimmereffectdemo.data.Product
import kotlinx.coroutines.delay

val sampleProducts = listOf(
    Product(1, "Fits 15 Laptops", "$699", "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"),
    Product(2, "Slim Fit T-Shirts", "$999", "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg"),
    Product(3, "Mens Cotton Jacket", "$199", "https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg") ,
    Product(4, "Mens Casual Slim Fit", "$69", "https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_.jpg"),
    Product(5, "Dragon Station Chain Bracelet", "$199", "https://fakestoreapi.com/img/71pWzhdJNwL._AC_UL640_QL65_ML3_.jpg"),
    Product(6, "Solid Gold Petite Micropave", "$169", "https://fakestoreapi.com/img/61sbMiUnoGL._AC_UL640_QL65_ML3_.jpg") ,
    Product(7, "White Gold Plated Princess", "$699", "https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg"),
    Product(8, "Women's Solid Short ", "$99", "https://fakestoreapi.com/img/71z3kpMAYsL._AC_UY879_.jpg"),
    Product(9, "Womens T Shirt Casual", "$109", "https://fakestoreapi.com/img/61pHAEJ4NML._AC_UX679_.jpg")
)

@Composable
fun ProductListScreen() {
    var isLoading by remember { mutableStateOf(true) }
    val products = remember { sampleProducts }

    LaunchedEffect(Unit) {
        delay(3000)
        isLoading = false
    }
    ProductList(products = if (isLoading) null else products, isLoading = isLoading)

}