package com.nsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Configuration
@RequestMapping("/prop")
public class PropCont {

	@Autowired
	SecurityProperties securityProperties;

	@Value("${server.port}")
	private static String port;

	@Value("${message:Default hllo}")
	String welcomeText;


	@RequestMapping(value = "/clientconfigUpdated", method = RequestMethod.GET)
	public String propp() {
		System.out.println("PORT :: " + port);
		System.out.println("GET PORT " + securityProperties.getPort());
		return welcomeText;
	}

}
