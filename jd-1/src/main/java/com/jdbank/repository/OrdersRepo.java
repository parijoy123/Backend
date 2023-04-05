package com.jdbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbank.entities.OrdersDetails;

public interface OrdersRepo extends JpaRepository<OrdersDetails, Integer> {

}
