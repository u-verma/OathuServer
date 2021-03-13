package com.easycoding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer

@SpringBootApplication
@EnableResourceServer
class EasycodingSecurityApplication

fun main(args: Array<String>) {
    runApplication<EasycodingSecurityApplication>(*args)
}
