package AbstractFactoryMode.ConcreteProduct.Unix;

import AbstractFactoryMode.AbstractProduct.Button;

public class UnixButton extends Button {
    @Override
    public void displayButton() {
        System.out.println("UnixButton");
    }
}
