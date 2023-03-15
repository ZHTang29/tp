package seedu.recipe.model.recipe.exceptions;

/**
 * Signals that the operation is invalid due to incorrect argument length (Arguments must follow a specified format or
 * else they would not be considered valid).
 */
public class RecipeDurationInvalidArgumentLengthException extends RuntimeException{
    public RecipeDurationInvalidArgumentLengthException() {
        super("An argument list of invalid length was passed for a Recipe Duration."
                + "\nEnsure it is of the following format: '{number OR decimal} {duration}; "
                + "\nExample: `1 minute`, `1.5 hours`");
    }
}
