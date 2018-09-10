package com.beercafeguy.spring.ms.customer;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.beercafeguy.spring.ms.customer")
public class CustomerConfig {

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
}
