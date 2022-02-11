package com.learning.spring.basics.componentScan

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ComponentDAO(@Autowired val jdbcConnection: ComponentJdbcConnection) {
}
