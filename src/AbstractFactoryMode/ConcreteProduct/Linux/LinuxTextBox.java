package AbstractFactoryMode.ConcreteProduct.Linux;

import AbstractFactoryMode.AbstractProduct.TextBox;

public class LinuxTextBox extends TextBox {
    @Override
    public void displayTestBox() {
        System.out.println("LinuxTextBox");
    }
}
