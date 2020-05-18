package DecoratorMode.ComponentImpl;

import DecoratorMode.BaseComponent;

public class Form extends BaseComponent {
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
