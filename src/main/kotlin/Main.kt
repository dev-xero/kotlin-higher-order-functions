class Cookie (
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf<Cookie> (
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),

    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),

    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),

    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),

    Cookie(
        name = "Snicker Doodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),

    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),

    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    cookies.forEach {
        println("Menu Item: ${it.name}")
    }

    println("\nFULL MENU")
    fullMenu.forEach {
        println(it)
    }
}