package AbstractFactoryMode.ConcreteProduct.Unix;

import AbstractFactoryMode.AbstractProduct.TextBox;

public class UnixTextBox  extends TextBox {
    @Override
    public void displayTestBox() {
        System.out.println("UnixTextBox");
    }
}
