package com.example.basicrecylerview

object BooksData {
    private val booksName = arrayOf("The Guest List",
    "The Vanishing Half",
    "House of Earth and Blood",
    "A Promised Land",
    "A Life on Our Planet: ",
    "Such a Fun Age",
    "Caste: The Origins of Our Discontents",
    "Dearly: New Poems",
    "Heartstopper: Volume Three",
    "The Midnight Library")

    private val booksAuthor = arrayOf("by Lucy Foley",
    "by Brit Bennett",
    "by Sarah J. Maas",
    "by Barack Obama",
    "by David Attenborough, Jonnie Hughes",
    "by Kiley Reid",
    "by Isabel Wilkerson",
    "by Margaret Atwood",
    "by Alice Oseman",
    "by Matt Haig")

    private val booksImage = intArrayOf(R.drawable.the_guest_list,
        R.drawable.the_vanishing_half,
        R.drawable.crescent_city,
        R.drawable.promised_land,
        R.drawable.a_life_on_our_planet,
        R.drawable.such_a_fun_age,
        R.drawable.caste,
        R.drawable.dearly,
        R.drawable.heartsropper,
        R.drawable.the_midnight_libary
    )

    val listData: ArrayList<Books>
    get(){
        val list = arrayListOf<Books>()
        for (position in booksName.indices){
            val book = Books()
            book.name = booksName[position]
            book.author = booksAuthor[position]
            book.photo = booksImage[position]
            list.add(book)

        }
        return list
    }
}