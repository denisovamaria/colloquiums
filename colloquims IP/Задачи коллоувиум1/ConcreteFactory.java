package fibonachi;

public class ConcreteFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new ButtonImpl();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxImpl();
    }
}
