package com.example.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShopListDao {

    @Query("Select * From shop_items")
    fun getShopList(): LiveData<List<ShopItemDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addShopItem(shopItemDbModel: ShopItemDbModel)

    @Query("Delete From shop_items Where id=:shopItemId")
    suspend fun deleteShopItem(shopItemId: Int)

    @Query("Select * From shop_items Where id=:shopItemId LIMIT 1")
    suspend fun getShopItem(shopItemId: Int): ShopItemDbModel
}