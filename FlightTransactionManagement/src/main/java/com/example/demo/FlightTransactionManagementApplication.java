package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FlightBookingAcknowledgement;
import com.example.demo.dto.FlightBookingRequest;
import com.example.demo.service.BookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
//Transaction Management example https://www.youtube.com/watch?v=95kxPSbHzVg
// In PostMan localhost:8091/bookFlightTicket give amount less then 18000 for success and more then for Failure
public class FlightTransactionManagementApplication {

	@Autowired
	private BookingService service;
	
	/*
	 * { "passengerInfo" : { "name" :"basant", "email" : "basant.gmail.com",
	 * "source": "Hyderabad", "destination" :"Hyd", "travelDate": "14-12-2022",
	 * "pickupTime" : "4.0 PM", "arrivalTime" : "6.0 PM", "fare" : 18000.0 },
	 * "paymentInfo" :{ "accountNo" :"acct1", "cardType": "DEBIT" }
	 * 
	 * }
	 */

	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
	}

	/*
	 * REquest Json Data : { "passengerInfo": { "name": "basant",
	 * "email":"basant@gmail.com", "source":"hyd", "destination":"Hyd",
	 * "travelDate":"04-12-2022", "pickupTime":"4.0pm", "arrivalTime":"6.0pm",
	 * "fare":"20000" },
	 * 
	 * "paymentInfo" : { "accountNo" : "acctNo1", "cardType":"DEBIT" }
	 * 
	 * }
	 */
//url post : http://localhost:8091/bookFlightTicket
//	youtube refrence : https://www.youtube.com/watch?v=95kxPSbHzVg
	public static void main(String[] args) {
		SpringApplication.run(FlightTransactionManagementApplication.class, args);
	}

}
