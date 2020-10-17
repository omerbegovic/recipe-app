package com.springframework.recipeapp.repositories;

import com.springframework.recipeapp.domain.Category;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
