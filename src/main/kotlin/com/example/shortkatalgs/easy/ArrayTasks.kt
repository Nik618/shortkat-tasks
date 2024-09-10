package com.example.shortkatalgs.easy

import org.springframework.stereotype.Service

@Service
class ArrayTasks {

    fun removeDuplicates() {
        var nums: IntArray = intArrayOf(1, 5, 8, 8, 12, 34, 37, 37, 37, 68, 89, 89)
        // val targetArray: IntArray = intArrayOf(1, 5, 8, 12, 34, 37, 68, 89)

        nums = nums.toSet().toIntArray()
        val k = nums.size

        println("${nums.toList()}, $k")
    }

}