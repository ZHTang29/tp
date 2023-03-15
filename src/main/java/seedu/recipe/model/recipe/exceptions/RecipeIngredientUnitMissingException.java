package seedu.recipe.model.recipe.exceptions;

/**
 * Signals that the operation cannot be completed because a unit of measurement for the recipe ingredient has not been
 * specified.
 */
public class RecipeIngredientUnitMissingException extends RuntimeException {
    public RecipeIngredientUnitMissingException() {
        super("A measurement unit for this recipe ingredient was not provided. Please set one first");
    }
}
