package com.learning.spring.basics.springin5.basic

import com.learning.spring.basics.springin5.basic.SortAlgorithim
import org.springframework.stereotype.Component

@Component
class BubbleSortAlgorithim : SortAlgorithim {
    override fun sort(numbers: Array<Int>): Array<Int> {
        // assume the logic works\
        println("Using bubble sort algorithm")
        return numbers
    }
}
