package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import com.demo.demo.exception.InsufficentAmountException;

public class PaymentIIUtil {

	private static Map<String, Double> paymentMap = new HashMap();

	static{
		paymentMap.put("acct1", 12000.0);
		paymentMap.put("acct2", 10000.0);
		paymentMap.put("acct3", 5000.0);
		paymentMap.put("acct4", 7000.0);
		paymentMap.put("acct5", 15000.0);
	}

	public static boolean validateCreditLimit(String accNo, double paidAmount) {
		System.out.println("paidAmount :..."+paidAmount);
		System.out.println("accNo :..."+accNo);
		System.out.println("paymentMap.get(accNo)...:"+paymentMap.get(accNo));
		if (paidAmount > 18000.0) {
			throw new InsufficentAmountException("Insufficent fund.....");
		} else {
			return true;
		}
	}
}
