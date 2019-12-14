package mx.com.mb3.runnergps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@RefreshScope
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration  
@ComponentScan(basePackages = "mx.com.mb3")
@EnableJpaRepositories("mx.com.mb3")
public class RunnerGpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerGpsApplication.class, args);
	}

}
