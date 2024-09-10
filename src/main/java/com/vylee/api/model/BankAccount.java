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
	private String accountName;

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

	public Long getVendor_id() {
		return vendorId;
	}

	public void setVendor_id(Long vendor_id) {
		this.vendorId = vendor_id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
