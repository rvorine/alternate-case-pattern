fun alternateCase(input: String): String {
    var makeUpper = true
    val result = StringBuilder()
    for (ch in input) {
        result.append(
            when {
                ch.isLetter() -> {
                    val converted = if (makeUpper) ch.uppercaseChar() else ch.lowercaseChar()
                    makeUpper = !makeUpper
                    converted
                }
                else -> ch
            }
        )
    }
    return result.toString()
}

fun main() {
    println(alternateCase("instagram"))  // InStAgRaM
    println(alternateCase("hello world"))  // HeLlO wOrLd
    println(alternateCase("abc123def"))  // AbC123DeF
}
