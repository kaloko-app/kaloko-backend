package com.kaloko.app.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

/**
 * Logs the volume of water consumed by a user on a specific date.
 */
@Entity
@Table(name = "water_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class WaterLog {

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

    @Column(name = "milliliters", nullable = false)
    @ToString.Include
    private Integer milliliters;

    @PrePersist
    protected void onCreate() {
        this.date = LocalDateTime.now();
    }
}
