package com.nindy.uts_nindyaputriyonedi.model

import com.nindy.uts_nindyaputriyonedi.R

data class model(
    val gambar : Int,
    val nama : String,
    val detailMakanan : String
)
object MockList{

    fun getmodel() : List<model> {
        val itemModel1 = model(
            R.drawable.img1,
            "Chicken Curry",
            "Lorem ipsum dolor sit amet, consectetur."
        )
        val itemModel2 = model(
            R.drawable.img2,
            "Chicken Burger",
            "Lorem ipsum dolor sit amet, consectetur."
        )
        val itemModel3 = model(
            R.drawable.makan2,
            "Broccoli Lasagna",
            "Lorem ipsum dolor sit amet, consectetur."
        )
        val itemModel4 = model(
            R.drawable.makanan,
            "Mexican Appetizer",
            "Lorem ipsum dolor sit amet, consectetur."
        )
        val itemList: ArrayList<model> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)

        return itemList
    }
}
