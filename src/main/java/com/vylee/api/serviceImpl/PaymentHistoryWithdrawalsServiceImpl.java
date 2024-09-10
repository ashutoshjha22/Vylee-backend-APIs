package com.vylee.api.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vylee.api.model.BankAccount;
import com.vylee.api.model.PaymentHistoryEarn;
import com.vylee.api.model.PaymentHistoryWithdrawals;
import com.vylee.api.repo.PaymentHistoryEarnRepo;
import com.vylee.api.repo.PaymentHistoryWithdrawalsRepo;
import com.vylee.api.services.PaymentHistoryEarnService;
import com.vylee.api.services.PaymentHistoryWithdrawalsService;

@Service
public class PaymentHistoryWithdrawalsServiceImpl implements PaymentHistoryWithdrawalsService {

    @Autowired
    private PaymentHistoryWithdrawalsRepo paymentHistoryWithdrawalsRepo;

    @Override
    public List<PaymentHistoryWithdrawals> getAllPayments() {
        return paymentHistoryWithdrawalsRepo.findAll();
    }

    @Override
	public List<PaymentHistoryWithdrawals> getPaymentByvendorId(Long vendorId) {
    	List<PaymentHistoryWithdrawals>findByVenderId = paymentHistoryWithdrawalsRepo.findByVendorId(vendorId);
        return findByVenderId;
    }

    @Override
	public PaymentHistoryWithdrawals createPayment(PaymentHistoryWithdrawals paymentHistoryWithdrawals, Long vendorId) {
    	paymentHistoryWithdrawals.setVenderId(vendorId);
        return paymentHistoryWithdrawalsRepo.save(paymentHistoryWithdrawals);
    }

		}

