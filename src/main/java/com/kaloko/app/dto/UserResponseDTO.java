package com.kaloko.app.dto;

import com.kaloko.app.entity.ActivityLevel;
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
    private Double currentWeight;
    private Double weightGoal;
    private Double height;
    private Integer age;
    private ActivityLevel activityLevel;
    private Double bodyFatPercentage;
    private Integer dailyCalories;
    private Integer proteinGoal;
    private Integer carbGoal;
    private Integer fatGoal;
}
