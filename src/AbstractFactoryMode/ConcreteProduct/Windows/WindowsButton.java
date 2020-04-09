package AbstractFactoryMode.ConcreteProduct.Windows;

import AbstractFactoryMode.AbstractProduct.Button;

public class WindowsButton extends Button {
    @Override
    public void displayButton() {
        System.out.println("WindosButton");
    }
}
