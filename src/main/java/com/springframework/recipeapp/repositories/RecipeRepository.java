package com.springframework.recipeapp.repositories;

import com.springframework.recipeapp.domain.Recipe;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
