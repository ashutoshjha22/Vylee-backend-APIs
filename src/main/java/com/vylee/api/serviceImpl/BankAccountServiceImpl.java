package com.vylee.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vylee.api.model.BankAccount;
import com.vylee.api.repo.BankAccountRepository;
import com.vylee.api.services.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Override
	public BankAccount createAccount(BankAccount bankAccount, Long vendorId) {
		bankAccount.setVendor_id(vendorId);
		return bankAccountRepository.save(bankAccount);
	}

	@Override
	public void deleteAccount(Long vendorId) {
		bankAccountRepository.deleteById(vendorId);
	}

	@Override
	public List<BankAccount> getAccountByvendorId(Long vendorId) {
		List<BankAccount> findByVendor_Id = bankAccountRepository.findByVendorId(vendorId);
		return findByVendor_Id;
	}

}
