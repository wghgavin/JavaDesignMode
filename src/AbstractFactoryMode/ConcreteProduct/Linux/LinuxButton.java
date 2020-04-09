package AbstractFactoryMode.ConcreteProduct.Linux;

import AbstractFactoryMode.AbstractProduct.Button;

public class LinuxButton extends Button {
    @Override
    public void displayButton() {
        System.out.println("LinuxButton");
    }
}
