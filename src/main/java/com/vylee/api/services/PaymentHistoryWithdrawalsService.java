package com.vylee.api.services;
import java.util.List;

import com.vylee.api.model.PaymentHistoryWithdrawals;

public interface PaymentHistoryWithdrawalsService {
    List<PaymentHistoryWithdrawals> getAllPayments();
    List<PaymentHistoryWithdrawals> getPaymentByvendorId(Long vendorId);
    PaymentHistoryWithdrawals createPayment(PaymentHistoryWithdrawals paymentHistoryWithdrawals, Long vendorId);
 
}
