package com.example.venmamainproject.a_1st_Version.a_First_Screen_Package1

data class Chat1(
    val id: Int,
    val name: String,
    val time: String,
    val lastMessage: String?
)

data class Message1(
    val message: String,
    val isPeer: Boolean
)

object DummyData1 {
    val listChat1 = listOf(
        Chat1(
            id = 0,
            name = "Akhil USA",
            time = "08:46",
            lastMessage = "Encha ulla"
        ),
    )

    val listMessage = listOf(
        Message1("Hi Roy how are you ?", false),
        Message1("Iam fine, how are you ?", true),
        Message1("Iam fine too", false),
        Message1("What do you do now ?", true),
        Message1("Write a book, and doing my work", false),
        Message1("Wow, its so good man", true),
        Message1("Yeah", false),
        Message1("Iam fine too", false),
        Message1("What do you do now ?", true),
        Message1("Write a book, and doing my work", false),
        Message1("Wow, its so good man", true),
        Message1("Iam fine too", false),
        Message1("What do you do now ?", true),
        Message1("Write a book, and doing my work", false),
        Message1("Wow, its so good man", true),
    )
}