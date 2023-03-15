package seedu.recipe.model.recipe.exceptions;

/**
 * Signals that the operation cannot be completed because the recipe duration field has not been previously filled
 * (Recipe duration can only be returned if it is a field that is previously populated by user).
 */
public class RecipeDurationNotPresentException extends RuntimeException {
    public RecipeDurationNotPresentException() {
        super("A recipe duration has not yet been specified for this recipe - Please populate one");
    }
}
