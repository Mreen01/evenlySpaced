fun main() {
    println(evenlySpaced(2, 4, 6))
    println(evenlySpaced(4, 6, 2))
    println(evenlySpaced(4, 6, 3))
}

fun evenlySpaced(_a: Int, _b: Int, _c: Int): Boolean {
    var temp: Int

    // Reassigning to local variables since Kotlin arguments are read only
    var a = _a
    var b = _b
    var c = _c

    if(a > b) {
        temp = a
        a = b
        b = temp
    }

    if(b > c) {
        temp = b
        b = c
        c = temp
    }

    if(a > b) {
        temp = a
        a = b
        b = temp
    }

    return b - a == c - b
}