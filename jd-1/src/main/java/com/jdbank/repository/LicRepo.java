package com.jdbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbank.entities.LicInsurance;

public interface LicRepo extends JpaRepository<LicInsurance, Integer> {

}
