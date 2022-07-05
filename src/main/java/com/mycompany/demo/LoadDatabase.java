package com.mycompany.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycompany.demo.entities.Customer;
import com.mycompany.demo.repo.CustomerRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(CustomerRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Customer("Thomas", "van der Veen")));
      log.info("Preloading " + repository.save(new Customer("Ruben", "van der Veen")));
    };
  }
}