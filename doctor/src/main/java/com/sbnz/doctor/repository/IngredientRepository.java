/**
 * 
 */
package com.sbnz.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.doctor.model.Ingredient;


public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
