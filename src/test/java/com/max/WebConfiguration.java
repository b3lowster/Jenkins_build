package com.max;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author tsv@ciklum.com
 */
@Configuration
@ComponentScan("com.max")
@EnableWebMvc
public class WebConfiguration {
}
