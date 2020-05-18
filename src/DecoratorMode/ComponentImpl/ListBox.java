package DecoratorMode.ComponentImpl;

import DecoratorMode.BaseComponent;

public class ListBox extends BaseComponent {

    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
