package com.junabazar;

import com.junabazar.config.AuditorAwareImpl;
import com.junabazar.inventory.model.db.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class JunabazarApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunabazarApiApplication.class, args);
    }

    @Bean
    AuditorAware<User> auditorProvider() {
        return new AuditorAwareImpl();
    }
}
