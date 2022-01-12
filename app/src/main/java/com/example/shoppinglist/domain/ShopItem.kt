package com.example.shoppinglist.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFINED_ID
)

const val UNDEFINED_ID = -1