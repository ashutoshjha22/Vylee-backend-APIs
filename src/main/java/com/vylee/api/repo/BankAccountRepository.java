package com.vylee.api.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vylee.api.model.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
	List<BankAccount> findByVendorId(Long vendor_id);

}
