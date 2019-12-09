package ru.xpendence.dockerprofiles

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerProfilesApplication

fun main(args: Array<String>) {
    runApplication<DockerProfilesApplication>(*args)
}
