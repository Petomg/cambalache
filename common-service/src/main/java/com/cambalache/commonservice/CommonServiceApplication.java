package com.cambalache.commonservice;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class CommonServiceApplication {

	private final ServiceProperties serviceProperties;

	public CommonServiceApplication(ServiceProperties serviceProperties) {
		this.serviceProperties = serviceProperties;
	}

	public String message() {
		return this.serviceProperties.getMessage();
	}
}
