package com.themonkeycode;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The Monkey Code Spring Boot - Sample Application
 */
@SpringBootApplication
public class SampleApplication {

    private static Log logger = LogFactory.getLog(SampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    @Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {

            @Override
            public void contextInitialized(ServletContextEvent sce) {
                logger.info("***********  ServletContext initialized  **************");
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
                logger.info("**************  ServletContext destroyed  **************");
            }

        };
    }
}
