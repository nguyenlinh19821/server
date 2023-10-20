package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Service;


public interface ServiceRepository extends JpaRepository<Service, Integer>{
	Service findById(int id);
}
