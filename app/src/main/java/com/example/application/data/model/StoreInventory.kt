package com.example.application.data.model

data class StoreInventory(

    val id: String,
    val storeId: String,

    val name: String,
    val price: String,
    val imageRes: Int,
    val category: String
)