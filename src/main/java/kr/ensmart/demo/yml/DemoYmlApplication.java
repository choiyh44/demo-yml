package kr.ensmart.demo.yml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties()
public class DemoYmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoYmlApplication.class, args);
	}

}
