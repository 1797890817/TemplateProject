package com.ddbin.eflow.center.appconfig;

import com.ddbin.eflow.center.EflowCenterApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EflowCenterApplication.class);
	}

}
