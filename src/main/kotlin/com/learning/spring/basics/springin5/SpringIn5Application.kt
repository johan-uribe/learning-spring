package com.learning.spring.basics.springin5

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringIn5Application

fun main(args: Array<String>) {
	val applicationContext = runApplication<SpringIn5Application>(*args)
}
