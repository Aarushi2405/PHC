package com.example.PHC;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PHC.model.FollowUpSchedule;

@SpringBootApplication
@RestController
public class PhcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhcApplication.class, args);
	}

	

}
