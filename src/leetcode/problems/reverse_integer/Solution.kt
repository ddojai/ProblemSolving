package leetcode.problems.reverse_integer

import kotlin.NumberFormatException as NumberFormatException1

class Solution {
    fun reverse(x: Int): Int {
        return try {
            if (x >= 0) {
                x.toString().reversed().toInt()
            } else {
                val a = x * -1
                a.toString().reversed().toInt() * -1
            }
        } catch (e: NumberFormatException) {
            0
        }
    }
}
