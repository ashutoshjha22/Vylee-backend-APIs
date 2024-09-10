package com.vylee.api.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vylee.api.model.PaymentHistoryEarn;
import com.vylee.api.repo.PaymentHistoryEarnRepo;
import com.vylee.api.services.PaymentHistoryEarnService;

@Service
public class PaymentHistoryEarnServiceImpl implements PaymentHistoryEarnService {

    @Autowired
    private PaymentHistoryEarnRepo paymentHistoryEarnRepo;

    @Override
    public List<PaymentHistoryEarn> getAllPayments() {
        return paymentHistoryEarnRepo.findAll();
    }

    @Override
  	public List<PaymentHistoryEarn> getPaymentByvendorId(Long vendorId) {
      	List<PaymentHistoryEarn>findByVendorId = paymentHistoryEarnRepo.findByVendorId(vendorId);
          return findByVendorId;
      }

    @Override
  	public PaymentHistoryEarn createPayment(PaymentHistoryEarn paymentHistoryEarn, Long vendorId) {
      	paymentHistoryEarn.setVendorId(vendorId);
          return paymentHistoryEarnRepo.save(paymentHistoryEarn);
      }
}
