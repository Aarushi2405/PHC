package com.example.PHC.model;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class FollowUpSchedule{

    @Id
    @SequenceGenerator(
        name = "followupschedule_sequence",
        sequenceName = "followupschedule_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "followupschedule_sequence" 
    )
    private Long followUpID;
    private String samID;
    private String ashaID;
    private LocalDate scheduledVisit;
    private String status;


    public FollowUpSchedule() {
    }


    public FollowUpSchedule(Long followUpID, String samID, String ashaID, LocalDate scheduledVisit, String status) {
        this.followUpID = followUpID;
        this.samID = samID;
        this.ashaID = ashaID;
        this.scheduledVisit = scheduledVisit;
        this.status = status;
    }


    public FollowUpSchedule(String samID, String ashaID, LocalDate scheduledVisit, String status) {
        this.samID = samID;
        this.ashaID = ashaID;
        this.scheduledVisit = scheduledVisit;
        this.status = status;
    }


    public Long getFollowUpID() {
        return followUpID;
    }


    public void setFollowUpID(Long followUpID) {
        this.followUpID = followUpID;
    }


    public String getSamID() {
        return samID;
    }


    public void setSamID(String samID) {
        this.samID = samID;
    }


    public String getAshaID() {
        return ashaID;
    }


    public void setAshaID(String ashaID) {
        this.ashaID = ashaID;
    }


    public LocalDate getScheduledVisit() {
        return scheduledVisit;
    }


    public void setScheduledVisit(LocalDate scheduledVisit) {
        this.scheduledVisit = scheduledVisit;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "FollowUpSchedule [ashaID=" + ashaID + ", followUpID=" + followUpID + ", samID=" + samID
                + ", scheduledVisit=" + scheduledVisit + ", status=" + status + "]";
    }

    
    
}