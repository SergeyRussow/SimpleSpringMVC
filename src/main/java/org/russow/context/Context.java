package org.russow.context;

import org.russow.model.MyEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean
    public MyEntity autowiredMyEntity() {
        MyEntity myEntity = new MyEntity();
        return myEntity;
    }
}
