package com.kaloko.app.repository;

import com.kaloko.app.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository interface for Recipe entity.
 */
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    
    @Query("SELECT r FROM Recipe r LEFT JOIN r.createdBy u WHERE u.id = :userId OR r.isPublic = true")
    List<Recipe> findByCreatedByUserIdOrIsPublicTrue(@Param("userId") Long userId);
}
