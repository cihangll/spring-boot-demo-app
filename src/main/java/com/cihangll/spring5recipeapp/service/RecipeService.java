package com.cihangll.spring5recipeapp.service;

import com.cihangll.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
