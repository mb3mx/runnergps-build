package mx.com.mb3.runnerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class RunnerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerConfigServerApplication.class, args);
	}

}
