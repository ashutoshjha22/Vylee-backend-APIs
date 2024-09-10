package com.vylee.api.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vylee.api.model.PaymentHistoryWithdrawals;

public interface PaymentHistoryWithdrawalsRepo extends JpaRepository<PaymentHistoryWithdrawals, Long> {
	List<PaymentHistoryWithdrawals> findByVendorId(Long vendor_id);

}
