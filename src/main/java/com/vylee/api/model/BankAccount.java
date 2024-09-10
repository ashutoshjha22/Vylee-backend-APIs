package com.vylee.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bank_accounts")
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Long vendorId;

	@Column(nullable = false)
	private String accountHolderName;

	@Column(nullable = false)
	private String bankAccountNumber;

	@Column(nullable = false)
	private String bankName;

	@Column(nullable = false)
	private String ifscCode;

	@Column(nullable = false)
	private String emailAddress;

	@Column(nullable = false)
	private String mobileNumber;

	@Column(nullable = false)
	private String address;

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

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
