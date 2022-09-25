package com.example.PHC.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PHC.model.FollowUpSchedule;
import com.example.PHC.service.FollowUpScheduleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/followupschedule")
public class FollowUpScheduleController {
    
    private final FollowUpScheduleService followUpScheduleService;

    @Autowired
    public FollowUpScheduleController(FollowUpScheduleService followUpScheduleService){
        this.followUpScheduleService = followUpScheduleService;
    }

    @GetMapping()
	public List<FollowUpSchedule> getFollowUpSchedule() {
		return followUpScheduleService.getFollowUpSchedule();
	}

    @PostMapping
    public void addFollowUpSchedule(@RequestBody FollowUpSchedule followUpSchedule){
        followUpScheduleService.addFollowUpSchedule(followUpSchedule);
    }
}
