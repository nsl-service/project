package com.nsl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientApplication {

	 @Value("${welcome.message}")
	static String welcomeText;
	 
	 @Value("${server.port}")
		private  static String port;
	 
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		System.out.println("wel: "+port);
	}
	
	@RequestMapping(value = "/")
	   public String welcomeText() {
		 System.out.println("wel1: "+welcomeText);
	      return welcomeText;
	   }

}
