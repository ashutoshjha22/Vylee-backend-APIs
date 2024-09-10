package com.vylee.api.services;

import java.util.List;

import com.vylee.api.model.WorkingHours;

public interface WorkingHoursService {
    List<WorkingHours> getAllWorkingHours();
    WorkingHours getWorkingHoursById(Long id);
    WorkingHours createWorkingHours(WorkingHours workingHours, Long vendorId);
    WorkingHours updateWorkingHours(Long id, WorkingHours workingHours);
    void deleteWorkingHours(Long id);
}
