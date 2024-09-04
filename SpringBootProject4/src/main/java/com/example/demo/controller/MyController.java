package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.RestaurantApplication;
import com.example.demo.service.MyService;

//import com.example.demo.services.CrudService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MyController { 
	@Autowired

	private MyService service;
	
	@GetMapping("/")
	public String entrypage() {
		return "<h1>Welcome to SpringBootApp</h1>";
	}

	@GetMapping("/getDetails")

	public List<RestaurantApplication> fetchRestaurantApplicationList() {

		List<RestaurantApplication> products=new ArrayList<>(); //Logic to retch products service.fetchProductList():
		products=service.fetchRestaurantApplicationList();
		return products;
	
	}
	

	@GetMapping("/getDetails/{id}")

	public RestaurantApplication fetchRestaurantApplicationListById(@PathVariable int id) {
		return service.fetchRestaurantApplicationListById(id).get();
	}

	@PostMapping("/addDetails")
	public RestaurantApplication saveRestaurantApplicationList(@RequestBody RestaurantApplication product) {
		return service.saveRestaurantApplicationToBD(product);
	}
	@PutMapping("/updateDetails")
	public RestaurantApplication saveorUpdateRestaurantApplicationList(@RequestBody RestaurantApplication product) {
		return service.saveRestaurantApplicationToBD (product);
	}

	@DeleteMapping("/deleteDetails/{id}")

	public String deleteRestaurantApplicationListById(@PathVariable int id) {

	return service.deleteRestaurantApplicationListById(id);
	}

	
}