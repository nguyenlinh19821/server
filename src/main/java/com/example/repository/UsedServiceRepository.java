package com.example.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.UsedService;

public interface UsedServiceRepository extends JpaRepository<UsedService, Integer> {
	UsedService findByUserIdAndStatusAndDateEndGreaterThan(int id, String status, Date dateNow);
	UsedService findById(int id);
}
