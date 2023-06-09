package com.test.doctoranywhere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.test.doctoranywhere"
})
public class DoctoranywhereApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctoranywhereApplication.class, args);
	}

}
