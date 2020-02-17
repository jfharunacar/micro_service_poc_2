package tr.com.jforce.loan.starter;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "tr.com.*" })
@EntityScan(basePackages = {"tr.com.*"})
@EnableSwagger2
@EnableJpaRepositories(basePackages = { "tr.com.*" })
@EnableDiscoveryClient
@EnableEurekaClient
@EnableAutoConfiguration
@EnableFeignClients(basePackages = {"tr.com.*"})
@EnableJms
public class LoanServiceStarter {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 	SpringApplication.run(LoanServiceStarter.class, args);
	 
	}
	
	@Bean
	public ModelMapper getModelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
