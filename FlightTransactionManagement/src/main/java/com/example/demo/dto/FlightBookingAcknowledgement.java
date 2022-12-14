package com.example.demo.dto;

import com.example.demo.entity.PassengerInfo;

public class FlightBookingAcknowledgement {

	private String status;
	private double totalFare;
	private String pnr;
	private PassengerInfo passengerInfo;

	public FlightBookingAcknowledgement() {

	}

	public FlightBookingAcknowledgement(String status, double totalFare, String pnr, PassengerInfo passengerInfo) {
		super();
		this.status = status;
		this.totalFare = totalFare;
		this.pnr = pnr;
		this.passengerInfo = passengerInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

}
