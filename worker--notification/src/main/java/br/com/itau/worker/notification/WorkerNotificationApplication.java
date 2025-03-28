package br.com.itau.worker.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WorkerNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkerNotificationApplication.class, args);
	}

}
