package com.kaloko.app.repository;

import com.kaloko.app.entity.WorkoutLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository interface for WorkoutLog entity.
 */
@Repository
public interface WorkoutLogRepository extends JpaRepository<WorkoutLog, Long> {
    
    List<WorkoutLog> findByUserIdOrderByDateDesc(Long userId);
}
