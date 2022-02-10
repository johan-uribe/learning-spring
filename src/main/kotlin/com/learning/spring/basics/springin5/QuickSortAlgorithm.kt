package com.learning.spring.basics.springin5

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class QuickSortAlgorithm: SortAlgorithim {
    override fun sort(numbers: Array<Int>): Array<Int> {
        // assume the logic works
        println("Quick sort algorithm being used")
        return numbers
    }
}
