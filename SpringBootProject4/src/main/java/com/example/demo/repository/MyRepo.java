package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.RestaurantApplication;

public interface MyRepo extends JpaRepository<RestaurantApplication,Integer> {

}
