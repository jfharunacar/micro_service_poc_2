package tr.com.jforce.extclients.starter;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "tr.com.*" })
@EntityScan(basePackages = {"tr.com.*"})
@EnableSwagger2
@EnableJpaRepositories(basePackages = { "tr.com.*" })
@EnableDiscoveryClient
@EnableEurekaClient
@EnableAutoConfiguration
@EnableCaching
public class ExtClientServiceStarter {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 	SpringApplication.run(ExtClientServiceStarter.class, args);
	 
	}
	@Bean
	public ModelMapper getModelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
