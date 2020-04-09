package AbstractFactoryMode.ConcreteFactory;

import AbstractFactoryMode.AbstractFactory.SystemFactory;
import AbstractFactoryMode.AbstractProduct.Button;
import AbstractFactoryMode.AbstractProduct.TextBox;
import AbstractFactoryMode.ConcreteProduct.Unix.UnixButton;
import AbstractFactoryMode.ConcreteProduct.Unix.UnixTextBox;

public class UnixSystemFac extends SystemFactory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public TextBox createTextBox() {
        return new UnixTextBox();
    }
}
