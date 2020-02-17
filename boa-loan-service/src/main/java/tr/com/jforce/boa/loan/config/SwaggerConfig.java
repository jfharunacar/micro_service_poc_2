package tr.com.jforce.boa.loan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApiInfo())
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any())
				.build();
	}

	private ApiInfo createApiInfo() {
		ApiInfo info=new ApiInfo("BOA Loan Services", "BOA Loan Services demo implemented for International Bank of Azerbaijan", "1", "2","3","https://www.jforce.com.tr","5");
		return info;
	}
	  

 
}
