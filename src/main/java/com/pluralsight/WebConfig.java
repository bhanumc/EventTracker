package com.pluralsight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc		//Basically the same as servlet-config.xml
@ComponentScan(basePackages="com.pluralsight")
public class WebConfig {

	
}
