package seedu.recipe.model;

import javafx.collections.ObservableList;
import seedu.recipe.model.recipe.Recipe;

/**
 * Unmodifiable view of a recipe book
 */
public interface ReadOnlyRecipeBook {

    /**
     * Returns an unmodifiable view of the recipe list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Recipe> getRecipeList();

}
