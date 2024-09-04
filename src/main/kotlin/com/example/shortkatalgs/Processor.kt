package com.example.shortkatalgs

import com.example.shortkatalgs.easy.ArrayTasks
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class Processor(
    private val arrayTasks: ArrayTasks
) {

    @PostConstruct
    private fun startTasks() {
        arrayTasks.removeDuplicates()
    }

}