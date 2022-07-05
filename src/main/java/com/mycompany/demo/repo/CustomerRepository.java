package com.mycompany.demo.repo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.demo.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
    List<Customer> findByLastName(String lastName);

    Optional<Customer> findById(UUID id);
}
