package com.example.demo.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FlightBookingAcknowledgement;
import com.example.demo.dto.FlightBookingRequest;
import com.example.demo.entity.PassengerInfo;
import com.example.demo.entity.PaymentInfo;
import com.example.demo.repository.PassengerInfoRepository;
import com.example.demo.repository.PaymentInfoRepository;
import com.example.demo.util.PaymentIIUtil;

@Service
public class BookingService {
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	
	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		
		FlightBookingAcknowledgement acknowledgement = null;
		PassengerInfo passengerInfo = request.getPassengerInfo();
		PassengerInfo save = passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		
		PaymentIIUtil.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}

}
