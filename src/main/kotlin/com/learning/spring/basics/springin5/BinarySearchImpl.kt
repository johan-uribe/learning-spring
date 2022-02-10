package com.learning.spring.basics.springin5

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BinarySearchImpl(@Autowired private val sortAlgorithim: SortAlgorithim) {

    fun binarySearch(numbers: Array<Int>, numberToSearchFor: Int): Int {
        // sort array
        // bubble sort algorithm
        val sortedNumbers: Array<Int> = sortAlgorithim.sort(numbers)
        println(sortAlgorithim)
        // search array


        // return the index
        return 1
    }
}
