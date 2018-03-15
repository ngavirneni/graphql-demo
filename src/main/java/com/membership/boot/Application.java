package com.membership.boot;

import com.membership.query.MembershipQueryResolver;
import com.membership.query.MembershipResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public MembershipQueryResolver membershipQueryResolver() {
        return new MembershipQueryResolver();
    }

    @Bean
    public MembershipResolver membershipResolver() {
        return new MembershipResolver();
    }


}