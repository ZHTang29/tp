package seedu.recipe.model.recipe;

import seedu.recipe.model.recipe.unit.TimeUnit;

public class RecipeDuration {

    private final double time;
    private final TimeUnit unit;

    public RecipeDuration(double time, TimeUnit unit){
        this.time = time;
        this.unit = unit;
    }
}
