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

import com.vylee.api.model.PaymentHistoryWithdrawals;
import com.vylee.api.services.PaymentHistoryWithdrawalsService;

@RestController
@RequestMapping("/api/payments")
public class PaymentHistoryWithdrawalsCtrl {

    @Autowired
    private PaymentHistoryWithdrawalsService paymentHistoryWithdrawalsService;

    @GetMapping("/show-all-withdraw-details")
    public List<PaymentHistoryWithdrawals> getAllPayments() {
        return paymentHistoryWithdrawalsService.getAllPayments();
    }

	    @GetMapping("/show-withdraw-details/{id}")
    public ResponseEntity<List<PaymentHistoryWithdrawals>> getPaymentById(@PathVariable Long vendorId) {
	    List<PaymentHistoryWithdrawals>paymentByvendorId = paymentHistoryWithdrawalsService.getPaymentByvendorId(vendorId);
        return ResponseEntity.ok(paymentByvendorId);
    }

    @PostMapping("/add-payment-withdrawals/{vendorId}")
    public ResponseEntity<PaymentHistoryWithdrawals> createPayment(@RequestBody PaymentHistoryWithdrawals paymentHistoryWithdrawals,@PathVariable Long vendorId) {
    	PaymentHistoryWithdrawals createdPayment = paymentHistoryWithdrawalsService.createPayment(paymentHistoryWithdrawals,vendorId);
        return ResponseEntity.ok(createdPayment);
    }
    
   
}
