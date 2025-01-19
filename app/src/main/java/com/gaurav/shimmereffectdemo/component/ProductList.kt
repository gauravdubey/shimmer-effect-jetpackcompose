package com.gaurav.shimmereffectdemo.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.gaurav.shimmereffectdemo.data.Product

@Composable
fun ProductList(products: List<Product>?, isLoading: Boolean) {
    LazyColumn {
        if (isLoading) {
            items(9) {
                ProductItemShimmer()
            }
        } else {
            products?.let {
                items(it) { product ->
                    ProductItem(product = product)
                }
            }

        }
    }
}