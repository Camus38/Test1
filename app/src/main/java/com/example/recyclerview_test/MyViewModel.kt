package com.example.recyclerview_test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class MyViewModel :ViewModel() {
    val itemsListData = MutableLiveData<ArrayList<Item>>()
    val items = ArrayList<Item>()

    init{
        items.add(Item("person","서울","송파구"))
    }

    fun addItem(item: Item){
        items.add(item)
        itemsListData.value = items
    }

    fun updateItem(pos: Int,item: Item){
        items[pos] = item
        itemsListData.value = items
    }

    fun deleteItem(pos: Int){
        items.removeAt(pos)
        itemsListData.value = items
    }

}