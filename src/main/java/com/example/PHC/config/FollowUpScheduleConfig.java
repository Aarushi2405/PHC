package com.example.PHC.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.PHC.model.FollowUpSchedule;
import com.example.PHC.repository.FollowUpScheduleRepository;

@Configuration
public class FollowUpScheduleConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(FollowUpScheduleRepository repository) {
        return args -> {
            FollowUpSchedule a = new FollowUpSchedule(
				1L,
				"123",
				"A1",
				LocalDate.of(2022, Month.SEPTEMBER, 22),
				"DONE"
			);

            FollowUpSchedule b = new FollowUpSchedule(
				2L,
				"124",
				"A2",
				LocalDate.of(2022, Month.SEPTEMBER, 25),
				"DONE"
			);

            repository.saveAll(List.of(a,b));
        };
    }
}
  