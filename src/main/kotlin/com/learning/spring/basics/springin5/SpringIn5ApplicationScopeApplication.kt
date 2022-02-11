package com.learning.spring.basics.springin5

import com.learning.spring.basics.springin5.scope.PersonDAO
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringIn5ScopeApplication

private val logger = LoggerFactory.getLogger(SpringIn5ScopeApplication::class.java)

fun main(args: Array<String>) {
    val applicationContext = runApplication<SpringIn5ScopeApplication>(*args)
    val personDao = applicationContext.getBean(PersonDAO::class.java)
    val personDao2 = applicationContext.getBean(PersonDAO::class.java)

    logger.info("{}", personDao)
    logger.info("{}", personDao.jdbcConnection)

    logger.info("{}", personDao2)
    logger.info("{}", personDao2.jdbcConnection)
}
