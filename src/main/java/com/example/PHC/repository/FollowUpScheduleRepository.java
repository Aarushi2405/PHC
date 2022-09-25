package com.example.PHC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PHC.model.FollowUpSchedule;

@Repository
public interface FollowUpScheduleRepository 
        extends JpaRepository<FollowUpSchedule, Long>{
    
}
