package seedu.recipe.model.recipe.unit;

import static java.util.Objects.requireNonNull;

/**
 * Represents the unit of measurement for different data stored by a Recipe in RecipeBook.
 */
public abstract class Unit {

    public final String unit;

    public Unit(String unit) {
        requireNonNull(unit);
        this.unit = unit;
    }
}
