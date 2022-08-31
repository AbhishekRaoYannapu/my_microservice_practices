package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

@Entity
@Table(name = "PASSENGER_INFO")
public class PassengerInfo {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String source;
	private String destination;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;

	public PassengerInfo(Long id, String name, String email, String source, String destination, Date travelDate,
			String pickupTime, String arrivalTime, double fare) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.pickupTime = pickupTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}

	public PassengerInfo() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "PassengerInfo [id=" + id + ", name=" + name + ", email=" + email + ", source=" + source
				+ ", destination=" + destination + ", travelDate=" + travelDate + ", pickupTime=" + pickupTime
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}

}
