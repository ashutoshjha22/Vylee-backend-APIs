package com.vylee.api.services;

import java.util.List;

import com.vylee.api.model.BankAccount;

public interface BankAccountService {
	List<BankAccount> getAccountByvendorId(Long vendorId);
	BankAccount createAccount(BankAccount bankAccount, Long vendorId);
	void deleteAccount(Long vendorId);

}
