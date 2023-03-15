package seedu.recipe.model.recipe.exceptions;

/**
 * Signals that an invalid argument has been provided by the option, for the recipe argument field
 * (Arguments should follow the specified regex).
 */
public class RecipePortionInvalidArgumentException extends RuntimeException {
    public RecipePortionInvalidArgumentException(String s) {
        super(String.format("An invalid argument `s` was provided for the Recipe portion.", s));
    }
}
