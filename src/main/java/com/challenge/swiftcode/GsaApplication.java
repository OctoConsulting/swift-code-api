package com.challenge.swiftcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
/**
 * @author ruchirmehta
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class GsaApplication {
	private static final Logger logger = LoggerFactory.getLogger(GsaApplication.class);
	
    public static void main(String[] args) { 

		//we can't take arguments anyways, so we just obliterate the args array with our own stuff.
		args = new String[1];
		
		//if the env variable doesn't exist then deploy_env will be null
		// if running on comp, minc, prodlike, or prod, then the env var should be there
		String deploy_env = System.getenv("DEPLOY_ENV");
		logger.info("SwiftCode Application DEPLOY_ENV: " + deploy_env);

		if (deploy_env == null) {
			args[0] = "--spring.profiles.active=local";
			logger.info("Comment Application Will now deployment on: local" ); 
		}
		else {
			if ( !("comp".equals(deploy_env) || "minc".equals(deploy_env) || "login".equals(deploy_env) ||"prodlike".equals(deploy_env) || "prod".equals(deploy_env)) ) {
				logger.error("Comment Application Service "+deploy_env + " is not a recognized deploy environment, aborting.");
				return;
			}
			args[0] = "--spring.profiles.active=" + deploy_env;
			logger.info("Comment Application Service will now delpoy on: " + deploy_env);
		}

		SpringApplication.run(GsaApplication.class, args);
		logger.info("Comment Application - Finish Main" );
    }
}
