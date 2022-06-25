package com.sofia.revio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class RevioApplication

fun main(args: Array<String>) {
	runApplication<RevioApplication>(*args)
}
