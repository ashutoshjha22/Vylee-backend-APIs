package com.vylee.api.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vylee.api.model.PaymentHistoryRefunds;


public interface PaymentHistoryRefundsRepo extends JpaRepository<PaymentHistoryRefunds, Long> {
	List<PaymentHistoryRefunds> findByVendorId(Long vendor_id);

}
