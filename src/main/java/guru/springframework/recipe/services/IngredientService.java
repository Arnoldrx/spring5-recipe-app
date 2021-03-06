package guru.springframework.recipe.services;

import guru.springframework.recipe.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand savedIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
