package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.RestaurantApplication;
import com.example.demo.repository.MyRepo;



@Service
public class MyService {
	
 @Autowired
 	private MyRepo repo;

	 public List<RestaurantApplication> fetchRestaurantApplicationList(){

		 return repo.findAll();
		 }

	//select from product:

	public Optional<RestaurantApplication> fetchRestaurantApplicationListById(int id) {

		return repo.findById(id); // select from product where id?

	}
	

	public RestaurantApplication saveRestaurantApplicationToBD (RestaurantApplication product) {
		
		return repo.save(product);
		// insert into product value (?,?,?,?);
		 
	}

	

	public String deleteRestaurantApplicationListById(int id) {

			String result;
			try {
					repo.deleteById(id);

					result="Deleted";

			}
			catch (Exception e) {
				result="Not Deleted";
			}
			return result;

	}

	
}
