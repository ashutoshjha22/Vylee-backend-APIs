package com.vylee.api.services;
import java.util.List;

import com.vylee.api.model.PaymentHistoryEarn;

public interface PaymentHistoryEarnService {
    List<PaymentHistoryEarn> getAllPayments();
    List<PaymentHistoryEarn> getPaymentByvendorId(Long vendorId);
    PaymentHistoryEarn createPayment(PaymentHistoryEarn paymentHistoryEarn, Long vendorId);
 
  
}
