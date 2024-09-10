package com.vylee.api.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vylee.api.model.PaymentHistoryEarn;


public interface PaymentHistoryEarnRepo extends JpaRepository<PaymentHistoryEarn, Long> {
	List<PaymentHistoryEarn> findByVendorId(Long vendor_id);

}
