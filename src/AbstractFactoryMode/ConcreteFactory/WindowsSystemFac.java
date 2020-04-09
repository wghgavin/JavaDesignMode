package AbstractFactoryMode.ConcreteFactory;

import AbstractFactoryMode.AbstractFactory.SystemFactory;
import AbstractFactoryMode.AbstractProduct.Button;
import AbstractFactoryMode.AbstractProduct.TextBox;
import AbstractFactoryMode.ConcreteProduct.Windows.WindowsButton;
import AbstractFactoryMode.ConcreteProduct.Windows.WindowsTextBox;

public class WindowsSystemFac extends SystemFactory {
    @Override
    public Button createButton() {
        return  new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
