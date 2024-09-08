package com.example.shortkatalgs

import com.example.shortkatalgs.easy.ArrayTasksJava
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class Processor(
    private val arrayTasksJava: ArrayTasksJava
) {

    @PostConstruct
    private fun startTasks() {
        // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
        // сложность O(n)
        arrayTasksJava.rotate(arrayOf(1, 5, 8, 8, 12, 34, 37, 37, 37, 68, 89, 89), 10)
    }

}