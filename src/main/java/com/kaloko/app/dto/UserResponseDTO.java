package com.kaloko.app.dto;

import com.kaloko.app.entity.ActivityLevel;
import com.kaloko.app.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private Float currentWeight;
    private Float weightGoal;
    private Float height;
    private Integer age;
    private ActivityLevel activityLevel;
    private Gender gender;
    private Float bodyFatPercentage;
    private Integer dailyCalories;
    private Integer proteinGoal;
    private Integer carbGoal;
    private Integer fatGoal;
}
