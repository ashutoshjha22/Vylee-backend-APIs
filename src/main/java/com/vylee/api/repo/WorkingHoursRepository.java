package com.vylee.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vylee.api.model.WorkingHours;

@Repository
public interface WorkingHoursRepository extends JpaRepository<WorkingHours, Long> {
	Optional<WorkingHours> findByVendorId(Long vendor_id);

}
