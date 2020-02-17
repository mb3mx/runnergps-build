package mx.com.mb3.runnergps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@RefreshScope
//@EnableEurekaClient
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = { "mx.com.mb3"})
@EnableJpaRepositories(basePackages = {"mx.com.mb3"})
public class RunnerGpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerGpsApplication.class, args);
	}

}
