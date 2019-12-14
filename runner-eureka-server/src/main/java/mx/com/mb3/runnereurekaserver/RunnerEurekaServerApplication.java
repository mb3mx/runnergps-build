package mx.com.mb3.runnereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RunnerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerEurekaServerApplication.class, args);
	}

}
