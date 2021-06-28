package br.unicamp.mc851.evisita.oapi.srv.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class OapiSrvGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OapiSrvGatewayApplication.class, args);
	}

}
