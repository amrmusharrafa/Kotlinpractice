package org.example

fun main() {
    val listofnumbers = listOf(10, 20, 30, 20, 40)

    val setofnumbers = setOf(10, 20, 30, 20, 40)

    val ages = mapOf(
        "Ahmed" to 25,
        "Mona" to 30,
        "Amir" to 40
    )

    println(listofnumbers)
    println(setofnumbers)
    println(ages)
    println(listofnumbers[2])
}