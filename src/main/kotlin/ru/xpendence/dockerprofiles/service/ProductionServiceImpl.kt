package ru.xpendence.dockerprofiles.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

/**
 * Author: Vyacheslav Chernyshov
 * Date: 09.12.19
 * Time: 11:55
 * e-mail: slava_rossii@list.ru
 */
@Service
@Profile("prod")
class ProductionServiceImpl {

    @PostConstruct
    fun init() {
        println("===> production!")
    }
}
