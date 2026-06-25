package com.kaloko.app.repository;

import com.kaloko.app.entity.MealTemplateItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for MealTemplateItem entity.
 */
@Repository
public interface MealTemplateItemRepository extends JpaRepository<MealTemplateItem, Long> {
}
