package com.vylee.api.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vylee.api.model.BankAccount;
import com.vylee.api.model.PaymentHistoryEarn;
import com.vylee.api.services.PaymentHistoryEarnService;

@RestController
@RequestMapping("/api/payments")
public class PaymentHistoryEarnController {

	@Autowired
	private PaymentHistoryEarnService paymentHistoryEarnService;

	@GetMapping("/show-all-earn-details")
	public List<PaymentHistoryEarn> getAllPayments() {
		return paymentHistoryEarnService.getAllPayments();
	}

	@GetMapping("/show-earn-details/{id}")
	public ResponseEntity<List<PaymentHistoryEarn>> getPaymentById(@PathVariable Long vendorId) {
	List<PaymentHistoryEarn>paymentByvendorId = paymentHistoryEarnService.getPaymentByvendorId(vendorId);
		return ResponseEntity.ok(paymentByvendorId);
	}
	
	@PostMapping("/add-payment-earning/{vendorId}")
	public ResponseEntity<PaymentHistoryEarn> createPayment(@RequestBody PaymentHistoryEarn paymentHistoryEarn,@PathVariable Long vendorId) {
		PaymentHistoryEarn createdPayment = paymentHistoryEarnService.createPayment(paymentHistoryEarn,vendorId);
		return ResponseEntity.ok(createdPayment);
	}
	
}

