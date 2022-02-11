package com.learning.spring.basics.springin5.basic

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
class QuickSortAlgorithm: SortAlgorithim {
    override fun sort(numbers: Array<Int>): Array<Int> {
        // assume the logic works
        println("Quick sort algorithm being used")
        return numbers
    }
}
