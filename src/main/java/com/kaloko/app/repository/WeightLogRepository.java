package com.kaloko.app.repository;

import com.kaloko.app.entity.WeightLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for WeightLog entity.
 */
@Repository
public interface WeightLogRepository extends JpaRepository<WeightLog, Long> {
    
    List<WeightLog> findByUserIdOrderByDateDesc(Long userId);
    
    Optional<WeightLog> findFirstByUserIdOrderByDateDesc(Long userId);
}
