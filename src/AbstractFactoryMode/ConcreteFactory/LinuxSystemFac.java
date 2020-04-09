package AbstractFactoryMode.ConcreteFactory;

import AbstractFactoryMode.AbstractFactory.SystemFactory;
import AbstractFactoryMode.AbstractProduct.Button;
import AbstractFactoryMode.AbstractProduct.TextBox;
import AbstractFactoryMode.ConcreteProduct.Linux.LinuxButton;
import AbstractFactoryMode.ConcreteProduct.Linux.LinuxTextBox;

public class LinuxSystemFac extends SystemFactory {
    @Override
    public Button createButton() {
        return  new LinuxButton();
    }

    @Override
    public TextBox createTextBox() {
       return new LinuxTextBox();
    }
}
