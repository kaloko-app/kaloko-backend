package com.kaloko.app.dto;

import com.kaloko.app.entity.ActivityLevel;
import com.kaloko.app.entity.Gender;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMetricsUpdateRequestDTO {
    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Current weight is required")
    @Positive(message = "Current weight must be a positive number")
    private Float currentWeight;

    @NotNull(message = "Weight goal is required")
    @Positive(message = "Weight goal must be a positive number")
    private Float weightGoal;

    @NotNull(message = "Height is required")
    @Positive(message = "Height must be a positive number")
    private Float height;

    @NotNull(message = "Age is required")
    @Positive(message = "Age must be a positive number")
    private Integer age;

    @NotNull(message = "Activity level is required")
    private ActivityLevel activityLevel;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @Positive(message = "Body fat percentage must be a positive number")
    private Float bodyFatPercentage;
}
