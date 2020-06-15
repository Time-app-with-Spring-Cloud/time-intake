package es.pedrogalan.time.intake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class TimeIntakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeIntakeApplication.class, args);
	}

}
