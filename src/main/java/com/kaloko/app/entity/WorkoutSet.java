package com.kaloko.app.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Represents a set performed during an exercise in a workout session.
 */
@Entity
@Table(name = "workout_sets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class WorkoutSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_log_id", nullable = false)
    private WorkoutLog workoutLog;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    @Column(name = "reps")
    @ToString.Include
    private Integer reps;

    @Column(name = "weight_kg")
    @ToString.Include
    private Double weightKg;

    @Column(name = "cardio_distance_km")
    @ToString.Include
    private Double cardioDistanceKm;

    @Column(name = "calories_burned_estimated")
    @ToString.Include
    private Integer caloriesBurnedEstimated;
}
