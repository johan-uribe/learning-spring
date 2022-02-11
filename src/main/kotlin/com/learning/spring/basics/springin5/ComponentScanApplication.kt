package com.learning.spring.basics.springin5

import com.learning.spring.basics.componentScan.ComponentDAO
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.learning.spring.basics.componentScan")
class ComponentScanApplication

private val logger = LoggerFactory.getLogger(ComponentScanApplication::class.java)

fun main(args: Array<String>) {
    val applicationContext = runApplication<ComponentScanApplication>(*args)
    val personDao = applicationContext.getBean(ComponentDAO::class.java)
    val personDao2 = applicationContext.getBean(ComponentDAO::class.java)

    logger.info("{}", personDao)
    logger.info("{}", personDao.jdbcConnection)

    logger.info("{}", personDao2)
    logger.info("{}", personDao2.jdbcConnection)
}
