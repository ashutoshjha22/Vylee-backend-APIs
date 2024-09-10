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

import com.vylee.api.model.PaymentHistoryEarn;
import com.vylee.api.model.PaymentHistoryRefunds;
import com.vylee.api.services.PaymentHistoryRefundsService;

@RestController
@RequestMapping("/api/payments")
public class PaymentHistoryRefundsCtrl {

	@Autowired
	private PaymentHistoryRefundsService paymentHistoryRefundsService;

	@GetMapping("/show-all-refund-details")
	public List<PaymentHistoryRefunds> getAllPayments() {
		return paymentHistoryRefundsService.getAllPayments();
	}

	@GetMapping("/show-refund-details/{id}")
	public ResponseEntity<List<PaymentHistoryRefunds>> getPaymentById(@PathVariable Long vendorId) {
		List<PaymentHistoryRefunds> paymentByvendorId = paymentHistoryRefundsService.getPaymentByvendorId(vendorId);
		return ResponseEntity.ok(paymentByvendorId);
	}

	@PostMapping("/add-payment-refunds/{vendorId}")
	public ResponseEntity<PaymentHistoryRefunds> createPayment(@RequestBody PaymentHistoryRefunds paymentHistoryRefunds,
			@PathVariable Long vendorId) {
		PaymentHistoryRefunds createdPayment = paymentHistoryRefundsService.createPayment(paymentHistoryRefunds,
				vendorId);
		return ResponseEntity.ok(createdPayment);
	}

}
