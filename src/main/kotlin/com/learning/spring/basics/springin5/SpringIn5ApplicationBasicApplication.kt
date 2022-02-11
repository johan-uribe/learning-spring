package com.learning.spring.basics.springin5

import com.learning.spring.basics.springin5.basic.BinarySearchImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringIn5Application

fun main(args: Array<String>) {
	val applicationContext = runApplication<SpringIn5Application>(*args)
	val binarySearch = applicationContext.getBean(BinarySearchImpl::class.java)
	val sortedNumbers =  binarySearch.binarySearch(arrayOf(1, 2, 4, 3), 1)

	println(sortedNumbers)
}
