package com.george.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.george.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration( configuration.getMinvalue(), configuration.getMaxvalue());
		
	}
} 
