package com.aledma.kopringdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class KopringDemoApplication

fun main(args: Array<String>) {
    runApplication<KopringDemoApplication>(*args)
}
