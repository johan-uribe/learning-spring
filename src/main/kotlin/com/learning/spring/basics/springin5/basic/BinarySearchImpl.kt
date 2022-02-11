package com.learning.spring.basics.springin5.basic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class BinarySearchImpl(@Autowired private val sortAlgorithim: BubbleSortAlgorithim) {

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
