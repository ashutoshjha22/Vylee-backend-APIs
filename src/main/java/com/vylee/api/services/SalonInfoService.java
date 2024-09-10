package com.vylee.api.services;

import java.util.List;

import com.vylee.api.model.SalonInfo;

public interface SalonInfoService {
    List<SalonInfo> getAllSalons();
    SalonInfo getSalonById(Long id);
    SalonInfo createSalon(SalonInfo salonInfo);
    SalonInfo updateSalon(Long id, SalonInfo salonInfo);
    void deleteSalon(Long id);
}
