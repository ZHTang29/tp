package seedu.recipe.model.recipe;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.recipe.model.recipe.unit.TimeUnit;

/**
 * Represents the Duration that a Recipe is estimated to take to complete.
 */
public class RecipeDuration {
    public static final String MESSAGE_CONSTRAINTS =
        "A Recipe Duration should consist of a numeric/decimal section and an alphabetic time unit";
    private static final String VALIDATION_REGEX =
        "^(([2-9]\\d{0,2}|1\\d{1,2})(\\.\\d{1,3})?|[01]\\.\\d{0,2}[1-9])\\s+((hour|minute|second|day)s|min|h)$|"
            + "^(1|1.0)\\s+(hour|minute|day|second|min|h)$";

    private static final Pattern NEW_REGEX = Pattern.compile("((\\d+)(?:([.\\/])(\\d+))?)\\s+([A-Za-z ]+)");

    private final double time;
    private final TimeUnit timeUnit;

    /**
     * Generates and returns an instance of a RecipeDuration object, if the provided parameters are valid.
     *
     * @param time     The non-negative time amount
     * @param timeUnit The time unit instance
     */
    public RecipeDuration(double time, TimeUnit timeUnit) {
        this.time = time;
        this.timeUnit = timeUnit;
    }

    /**
     * Generates an instance of a RecipeDuration Object, provided the parameter string is formatted correctly.
     *
     * @param candidate The parameter string to input the time and unit into this factory.
     * @return The generated RecipeDuration instance, if the parameter is valid.
     */
    public static RecipeDuration of(String candidate) {
        Matcher matcher = NEW_REGEX.matcher(candidate);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(MESSAGE_CONSTRAINTS);
        }

        // 5 capture groups in the regex, so if the candidate string matches,
        // there should be 5 groups captured!
        assert matcher.groupCount() == 5;

        // parse time amount
        double time;
        if (matcher.group(3) != null && matcher.group(3).equals("/")) {
            // parse fractions
            double group1 = Double.parseDouble((matcher.group(2)));
            double group2 = Double.parseDouble((matcher.group(4)));
            time = group1 / group2;
        } else {
            // parse integers or decimals
            time = Double.parseDouble(matcher.group(1));
        }

        // parse time unit
        String unitString = matcher.group(5);

        return new RecipeDuration(time, new TimeUnit(unitString));
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.time, this.timeUnit.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, timeUnit);
    }

    public double getTime() {
        return time;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    @Override
    public boolean equals(Object o) {
        return o == this
            || o instanceof RecipeDuration
            && ((RecipeDuration) o).time == this.time
            && ((RecipeDuration) o).timeUnit.equals(this.timeUnit);
    }
}
