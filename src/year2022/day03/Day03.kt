package year2022.day03

import check
import readInput

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput = readInput("2022", "Day03_test")
    check(part1(testInput), 0)
    check(part2(testInput), 0)

    val input = readInput("2022", "Day03")
    println(part1(input))
    println(part2(input))
}

private fun part1(input: List<String>): Int {
    return input.size
}

private fun part2(input: List<String>): Int {
    return input.size
}