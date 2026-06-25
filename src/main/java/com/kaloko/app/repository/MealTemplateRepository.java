package com.kaloko.app.repository;

import com.kaloko.app.entity.MealTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for MealTemplate entity.
 */
@Repository
public interface MealTemplateRepository extends JpaRepository<MealTemplate, Long> {
}
