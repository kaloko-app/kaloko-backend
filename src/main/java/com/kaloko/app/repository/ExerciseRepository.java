package com.kaloko.app.repository;

import com.kaloko.app.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Exercise entity.
 */
@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
