package com.kaloko.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import lombok.*;

/**
 * Individual item within a meal template. Represents either a food item or a recipe.
 */
@Entity
@Table(name = "meal_template_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class MealTemplateItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_template_id", nullable = false)
    private MealTemplate mealTemplate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Column(name = "grams", nullable = false)
    @ToString.Include
    private Double grams;

    @AssertTrue(message = "Exactly one of food or recipe must be specified, not both.")
    public boolean isValidFoodOrRecipe() {
        return (food != null) ^ (recipe != null);
    }

    @PrePersist
    @PreUpdate
    protected void validateExclusivity() {
        if (!isValidFoodOrRecipe()) {
            throw new IllegalStateException("Exactly one of food or recipe must be specified, not both.");
        }
    }
}
