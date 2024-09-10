package com.vylee.api.services;
import java.util.List;

import com.vylee.api.model.PaymentHistoryRefunds;

public interface PaymentHistoryRefundsService {
    List<PaymentHistoryRefunds> getAllPayments();
    List<PaymentHistoryRefunds> getPaymentByvendorId(Long vendorId);
    PaymentHistoryRefunds createPayment(PaymentHistoryRefunds paymentHistoryRefunds, Long vendorId);
 
   }
