package com.vylee.api.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vylee.api.model.PaymentHistoryRefunds;
import com.vylee.api.repo.PaymentHistoryRefundsRepo;
import com.vylee.api.services.PaymentHistoryRefundsService;

@Service
public class PaymentHistoryRefundsServiceImpl implements PaymentHistoryRefundsService {

    @Autowired
    private PaymentHistoryRefundsRepo paymentHistoryRefundsRepo;

    @Override
    public List<PaymentHistoryRefunds> getAllPayments() {
        return paymentHistoryRefundsRepo.findAll();
    }

    @Override
  	public List<PaymentHistoryRefunds> getPaymentByvendorId(Long vendorId) {
      	List<PaymentHistoryRefunds>findByVendorId = paymentHistoryRefundsRepo.findByVendorId(vendorId);
          return findByVendorId;
      }

      @Override
  	public PaymentHistoryRefunds createPayment(PaymentHistoryRefunds paymentHistoryRefunds, Long vendorId) {
    	  paymentHistoryRefunds.setVendorId(vendorId);
          return paymentHistoryRefundsRepo.save(paymentHistoryRefunds);
      }

}
