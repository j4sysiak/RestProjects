package com.example.connectToDatabaseH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectToDatabaseH2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConnectToDatabaseH2Application.class, args);
	}

}

// log:
// [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'.
// Database available at 'jdbc:h2:mem:d02cc80e-cb49-473f-831c-22545b3405cd'
