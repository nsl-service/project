package com.nsl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@PropertySource("file:${spring.cloud.config.uri}/ServerConfig/src/main/resources/config/application-config")
public class SecurityProperties {
	
	@Value("${server.port}")
    private String port;
	
	
	  @Value("${test.as}") 
	  private String test;
	  public String getTest() { 
		  System.out.println("GET TEST :"+test); 
	  return test;
	  }
	 

	

	public String getPort() {
		//System.out.println("GET PORT :"+port);
		return port;
	}

	public void setPort(String port) {
		this.port = port;
		System.out.println("SER PORT :"+port);
	}

	
    
	

}
