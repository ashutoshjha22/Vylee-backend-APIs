package com.vylee.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payment_history_earn")
public class PaymentHistoryEarn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long vendorId;
    
    @Column(nullable = false)
    private String serviceName; 
    
    @Column(nullable = false)
    private Double amount;    
    
    private LocalDateTime dateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	} 

    
 
}
