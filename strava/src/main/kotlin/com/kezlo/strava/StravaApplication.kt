package com.kezlo.strava

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StravaApplication

fun main(args: Array<String>) {
    runApplication<StravaApplication>(*args)
}
