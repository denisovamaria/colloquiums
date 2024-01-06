package fibonachi;// AbstractFactoryTest.java
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    @Test
    public void testCreateButtonAndClick() {
        GUIFactory factory = new ConcreteFactory();

        Button button = factory.createButton();

        assertTrue(button instanceof ButtonImpl);
        assertEquals("Button clicked", performClick(button));
    }

    @Test
    public void testCreateCheckBoxAndCheck() {
        GUIFactory factory = new ConcreteFactory();

        CheckBox checkBox = factory.createCheckBox();

        assertTrue(checkBox instanceof CheckBoxImpl);

        assertEquals("Checkbox checked", performCheck(checkBox));
    }

    private String performClick(Button button) {
        return "Button clicked";
    }

    private String performCheck(CheckBox checkBox) {
        return "Checkbox checked";
    }
}
