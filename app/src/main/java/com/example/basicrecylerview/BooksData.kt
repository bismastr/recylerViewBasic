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
    private val booksAbout = arrayOf("On a remote island off the coast of Ireland, guests gather to celebrate the wedding of Jules Keegan and Will Slater. Will is a rising television star, handsome and charming. Jules is a smart, ambitious magazine publisher. Though the sea is a little choppy and the cell service spotty, their wedding is everything you'd expect of a young power couple: designer dress, four-tiered cake, boutique whiskey, vintage champagne. Every detail has been curated to perfection. All that's left to orchestrate is the happiness.",
    "Longlisted for the National Book Award, Brit Bennett’s ambitious novel follows two identical twin sisters from a small Southern town. One stays home in her Black community; the other passes for white in the wider world. Provocative and compassionate, Bennett’s book traces fascinating threads of American identity and is our hands-down winner for the 2020 Historical Fiction award.",
    "Bryce Quinlan had the perfect life—working hard all day and partying all night—until a demon murdered her closest friends, leaving her bereft, wounded, and alone. When the accused is behind bars but the crimes start up again, Bryce finds herself at the heart of the investigation. She’ll do whatever it takes to avenge their deaths",
    "A riveting, deeply personal account of history in the making—from the president who inspired us to believe in the power of democracy. In the stirring, highly anticipated first volume of his presidential memoirs, Barack Obama tells the story of his improbable odyssey from young man searching for his identity to leader of the free world.",
    "I am 94. I've had an extraordinary life. It's only now that I appreciate how extraordinary. As a young man, I felt I was out there in the wild, experiencing the untouched natural world - but it was an illusion. The tragedy of our time has been happening all around us, barely noticeable from day to day - the loss of our planet's wild places, its biodiversity.",
    "In the midst of a family crisis one late evening, white blogger Alix Chamberlain calls her African American babysitter, Emira, asking her to take toddler Briar to the local market for distraction. There, the security guard accuses Emira of kidnapping Briar, and Alix's efforts to right the situation turn out to be good intentions selfishly mismanaged.",
    "The Pulitzer Prize–winning, bestselling author of The Warmth of Other Suns examines the unspoken caste system that has shaped America and shows how our lives today are still defined by a hierarchy of human divisions.\n" +
            "“As we go about our daily lives, caste is the wordless usher in a darkened theater, flashlight cast down in the aisles, guiding us to our assigned seats for a performance.",
    "In Dearly, Margaret Atwood’s first collection of poetry in over a decade, Atwood addresses themes such as love, loss, the passage of time, the nature of nature and - zombies. Her new poetry is introspective and personal in tone, but wide-ranging in topic. In poem after poem, she casts her unique imagination and unyielding, observant eye over the landscape of a life carefully and intuitively lived.",
    "Boy meets boy. Boys become friends. Boys fall in love. An LGBTQ+ graphic novel about life, love, and everything that happens in between: this is the third volume of HEARTSTOPPER, for fans of The Art of Being Normal, Holly Bourne and Love, Simon.\n" +
            "Charlie didn't think Nick could ever like him back, but now they're officially boyfriends. Nick's even found the courage to come out to his mum.",
    "Between life and death there is a library, and within that library, the shelves go on forever. Every book provides a chance to try another life you could have lived. To see how things would be if you had made other choices . . . Would you have done anything different, if you had the chance to undo your regrets?”\n" +
            "A dazzling novel about all the choices that go into a life well lived, from the internationally bestselling author of Reasons to Stay Alive and How To Stop Time.")
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
            book.about = booksAbout[position]
            list.add(book)

        }
        return list
    }
}