package com.kaloko.app.repository;

import com.kaloko.app.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Food entity.
 */
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
    Optional<Food> findByBarcode(String barcode);
    
    List<Food> findByNameContainingIgnoreCase(String name);
}
