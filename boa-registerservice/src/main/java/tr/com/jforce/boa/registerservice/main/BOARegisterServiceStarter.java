package tr.com.jforce.boa.registerservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author harun.acar
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class BOARegisterServiceStarter {

	public static void main(String[] args) {
		SpringApplication.run(BOARegisterServiceStarter.class, args);
	}
}
