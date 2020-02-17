package tr.com.jforce.kyc.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "tr.com.*" })
@EntityScan(basePackages = {"tr.com.*"})
@EnableAutoConfiguration
public class KYCStarter {

	public static void main(String[] args) {
		SpringApplication.run(KYCStarter.class, args);
	}
}
