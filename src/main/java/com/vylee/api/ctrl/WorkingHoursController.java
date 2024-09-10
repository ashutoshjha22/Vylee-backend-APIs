package com.vylee.api.ctrl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vylee.api.model.BankAccount;
import com.vylee.api.model.WorkingHours;
import com.vylee.api.services.WorkingHoursService;

@RestController
@RequestMapping("/api/working-hours")
public class WorkingHoursController {

    @Autowired
    private WorkingHoursService workingHoursService;

    @GetMapping
    public List<WorkingHours> getAllWorkingHours() {
        return workingHoursService.getAllWorkingHours();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkingHours> getWorkingHoursById(@PathVariable Long id) {
        WorkingHours workingHours = workingHoursService.getWorkingHoursById(id);
        return workingHours != null ? ResponseEntity.ok(workingHours) : ResponseEntity.notFound().build();
    }

    @PostMapping("/add-working-hours/{vendorId}")
    public ResponseEntity<WorkingHours> createWorkingHours(@RequestBody WorkingHours workingHours,@PathVariable Long venderId) {
    	WorkingHours createWorkingHours = workingHoursService.createWorkingHours(workingHours, venderId);
        return ResponseEntity.ok(createWorkingHours);
    }
    
   
    @PutMapping("/{id}")
    public ResponseEntity<WorkingHours> updateWorkingHours(@PathVariable Long id, @RequestBody WorkingHours workingHours) {
        WorkingHours updated = workingHoursService.updateWorkingHours(id, workingHours);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkingHours(@PathVariable Long id) {
        workingHoursService.deleteWorkingHours(id);
        return ResponseEntity.noContent().build();
    }
}
