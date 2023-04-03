package seedu.recipe.storage.jsonadapters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.recipe.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.recipe.commons.exceptions.IllegalValueException;
import seedu.recipe.model.recipe.unit.PortionUnit;

public class JsonAdaptedPortionUnitTest {
    private static final String VALID_UNIT = "grams";
    private static final String INVALID_UNIT = "123";

    @Test
    public void constructor_validUnit_returnsJsonAdaptedPortionUnitTest() {
        PortionUnit modelUnit = new PortionUnit(VALID_UNIT);
        JsonAdaptedPortionUnit adaptedUnit = new JsonAdaptedPortionUnit(modelUnit);
        assertEquals(VALID_UNIT, adaptedUnit.getUnit());
    }
    //Patch By Filbert
    @Test
    public void constructor_invalidUnit_throwsIllegalValueException() {
        assertThrows(IllegalValueException.class, () -> new PortionUnit(INVALID_UNIT));
    }

    @Test
    public void toModelType_validUnit_success() throws IllegalValueException {
        JsonAdaptedPortionUnit adaptedUnit = new JsonAdaptedPortionUnit(VALID_UNIT);
        PortionUnit modelUnit = adaptedUnit.toModelType();
        assertEquals(VALID_UNIT, modelUnit.getUnit());
    }
    //Patch By Filbert
    @Test
    public void toModelType_invalidUnit_throwsIllegalValueException() {
        JsonAdaptedPortionUnit adaptedUnit = new JsonAdaptedPortionUnit(INVALID_UNIT);
        assertThrows(IllegalValueException.class, adaptedUnit::toModelType);
    }
}
