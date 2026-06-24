package com.devopsdemo.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

    Logger logger= LoggerFactory.getLogger(JenkinsApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("test is executing");
        assertEquals(true,true);
        logger.info("test is executed next statement");
        logger.info("test is executed later statement");
    }

}
