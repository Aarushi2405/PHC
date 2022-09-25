package com.example.PHC.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PHC.model.FollowUpSchedule;
import com.example.PHC.repository.FollowUpScheduleRepository;

@Service
public class FollowUpScheduleService {
    
    private final FollowUpScheduleRepository followUpScheduleRepository;

    @Autowired
    public FollowUpScheduleService(FollowUpScheduleRepository followUpScheduleRepository){
        this.followUpScheduleRepository = followUpScheduleRepository;
    }

	public List<FollowUpSchedule> getFollowUpSchedule() {
		return followUpScheduleRepository.findAll();
	}

    public void addFollowUpSchedule(FollowUpSchedule followUpSchedule){
        System.out.print(followUpSchedule );
        followUpScheduleRepository.save(followUpSchedule);
    }

}
