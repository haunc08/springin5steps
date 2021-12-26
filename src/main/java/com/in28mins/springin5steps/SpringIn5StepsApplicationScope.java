package com.in28mins.springin5steps;

import com.in28mins.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplicationScope {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationScope.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationScope.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());
    }

}