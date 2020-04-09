package AbstractFactoryMode.AbstractFactory;

import AbstractFactoryMode.AbstractProduct.Button;
import AbstractFactoryMode.AbstractProduct.TextBox;

public abstract class SystemFactory {
    public abstract Button createButton();
    public abstract TextBox createTextBox();
}
