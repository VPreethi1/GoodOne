package com.example.Adress.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adress {
	@Id
	@GeneratedValue
	private int addressId;
	private int addressLane;
	private String roadName;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getAddressLane() {
		return addressLane;
	}
	public void setAddressLane(int addressLane) {
		this.addressLane = addressLane;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	
}
