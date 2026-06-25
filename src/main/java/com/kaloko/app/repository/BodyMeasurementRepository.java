package com.kaloko.app.repository;

import com.kaloko.app.entity.BodyMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository interface for BodyMeasurement entity.
 */
@Repository
public interface BodyMeasurementRepository extends JpaRepository<BodyMeasurement, Long> {
    
    List<BodyMeasurement> findByUserIdOrderByDateDesc(Long userId);
}
