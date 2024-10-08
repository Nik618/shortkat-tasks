package com.example.shortkatalgs

import com.example.shortkatalgs.easy.ArrayTasks
import com.example.shortkatalgs.easy.ArrayTasksJava
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class Processor(
    private val arrayTasksJava: ArrayTasksJava
) {

    @PostConstruct
    private fun startTasks() {
        // arrayTasksJava.removeDuplicates(arrayOf(1, 5, 8, 8, 12, 34, 37, 37, 37, 68, 89, 89))
        arrayTasksJava.intersection(arrayOf(1, 2, 4, 5, 5, 7), arrayOf(2, 5, 5))
    }

}