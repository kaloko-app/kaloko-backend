package com.kaloko.app.repository;

import com.kaloko.app.entity.WaterLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Repository interface for WaterLog entity.
 */
@Repository
public interface WaterLogRepository extends JpaRepository<WaterLog, Long> {
    
    List<WaterLog> findByUserIdAndDateBetween(Long userId, LocalDateTime start, LocalDateTime end);
}
