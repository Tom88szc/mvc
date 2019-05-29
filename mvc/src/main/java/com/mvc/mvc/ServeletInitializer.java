package com.mvc.mvc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServeletInitializer extends SpringBootServletInitializer {

@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
    return applicationBuilder.sources ( MvcApplication.class );
}

}
