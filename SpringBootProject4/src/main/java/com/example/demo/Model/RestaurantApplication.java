package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RestaurantApplication {
	
	@Id
	
	private int tid;
	private String menu;
	private String comments;
	private double rating;
	private double bill;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		tid = tid;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		menu = menu;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		comments = comments;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		rating = rating;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	

}
