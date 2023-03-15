package seedu.recipe.model.recipe.exceptions;

/**
 * Signals that the operation cannot be completed because the recipe portion field has not been previously filled
 * (Recipe portion can only be returned if it is a field that is previously populated by user).
 */
public class RecipePortionNotPresentException extends RuntimeException {
    public RecipePortionNotPresentException() {
        super("A Recipe Portion was not specified for this recipe - please provide one");
    }
}
