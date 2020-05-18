package DecoratorMode.ComponentImpl;

import DecoratorMode.BaseComponent;

public class TextBox extends BaseComponent {
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
