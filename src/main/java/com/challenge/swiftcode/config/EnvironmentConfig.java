package com.challenge.swiftcode.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfig  implements EnvironmentAware {

	private static Environment env = null;

	@Override
	public void setEnvironment(Environment env) {
		EnvironmentConfig.env = env;
	}

	public static String getProperty(String propertyName) {
		if(env != null)
			return env.getProperty(propertyName);
		else
			return null;
	}

}
