package com.learning.spring.basics.springin5.scope

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PersonDAO(@Autowired val jdbcConnection: JdbcConnection) {
}
