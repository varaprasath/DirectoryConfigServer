package com.explorer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ExplorerConfigApplication {

	static void main(String[] args) {
		SpringApplication.run(ExplorerConfigApplication, args)
	}

}
