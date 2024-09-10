package com.vylee.api.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vylee.api.model.BankAccount;
import com.vylee.api.services.BankAccountService;

@RestController
@RequestMapping("/api/accounts")
public class BankAccountController {

	@Autowired
	private BankAccountService bankAccountService;

	@GetMapping("/show-bank-data{vendorId}")
	public ResponseEntity<List<BankAccount>> getAccountById(@PathVariable Long vendorId) {
		List<BankAccount> accountByvendorId = bankAccountService.getAccountByvendorId(vendorId);
		return ResponseEntity.ok(accountByvendorId);
	}

	@PostMapping("/add-bank-account/{vendorId}")
	public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount bankAccount,
			@PathVariable Long vendorId) {
		BankAccount createdAccount = bankAccountService.createAccount(bankAccount, vendorId);
		return ResponseEntity.ok(createdAccount);
	}

	@DeleteMapping("/{Id}")
	public ResponseEntity<Void> deleteAccount(@PathVariable Long vendorId) {
		bankAccountService.deleteAccount(vendorId);
		return ResponseEntity.noContent().build();
	}
}
