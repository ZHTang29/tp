package seedu.recipe.model.recipe.exceptions;

/**
 * Signals that the operation is invalid due incorrect arguments (The amount of time that is specified should be given
 * in numbers/decimals only).
 */
public class RecipeDurationInvalidDurationException extends RuntimeException {
    public RecipeDurationInvalidDurationException(String durationCandidate) {
        super(String.format("An invalid amount of time was provided for the Recipe Duration: `%s`", durationCandidate)
            + "\nEnsure it is a valid number/decimal"
        );
    }
}
