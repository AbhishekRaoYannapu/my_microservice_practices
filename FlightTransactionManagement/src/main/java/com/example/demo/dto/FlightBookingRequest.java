package com.example.demo.dto;

import com.example.demo.entity.PassengerInfo;
import com.example.demo.entity.PaymentInfo;

public class FlightBookingRequest {
	private PassengerInfo passengerInfo;

	private PaymentInfo paymentInfo;

	public FlightBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentInfo = paymentInfo;
	}

	public FlightBookingRequest() {

	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	
	
}
