package com.kaloko.app.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

/**
 * Logs detailed body measurements of a user on a specific date.
 */
@Entity
@Table(name = "body_measurements")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class BodyMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "date")
    @ToString.Include
    private LocalDateTime date;

    @Column(name = "body_fat_percentage")
    private Double bodyFatPercentage;

    @Column(name = "waist_cm")
    private Double waistCm;

    @Column(name = "chest_cm")
    private Double chestCm;

    @Column(name = "biceps_cm")
    private Double bicepsCm;

    @Column(name = "thigh_cm")
    private Double thighCm;

    @PrePersist
    protected void onCreate() {
        this.date = LocalDateTime.now();
    }
}
