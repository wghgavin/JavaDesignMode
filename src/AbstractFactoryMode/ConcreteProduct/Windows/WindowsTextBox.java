package AbstractFactoryMode.ConcreteProduct.Windows;

import AbstractFactoryMode.AbstractProduct.TextBox;

public class WindowsTextBox extends TextBox {
    @Override
    public void displayTestBox() {
        System.out.println("WindowsTextBox");
    }
}
