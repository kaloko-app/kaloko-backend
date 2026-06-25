package com.kaloko.app.repository;

import com.kaloko.app.entity.WorkoutSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository interface for WorkoutSet entity.
 */
@Repository
public interface WorkoutSetRepository extends JpaRepository<WorkoutSet, Long> {
    
    List<WorkoutSet> findByWorkoutLogId(Long workoutLogId);
}
