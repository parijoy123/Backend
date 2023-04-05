package com.jdbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbank.entities.Customers;

public interface CustomersRepo extends JpaRepository<Customers, Integer> {

}
