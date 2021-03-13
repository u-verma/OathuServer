package com.easycoding.contoller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserInfoController {

    @GetMapping("/userinfo")
    fun getUserInfo(): String {
        return "User info is accessible by Admin"
    }

    @GetMapping("/username")
    fun getUserName(): String {
        return "User name can be accessed by Admin or Developer"
    }
}