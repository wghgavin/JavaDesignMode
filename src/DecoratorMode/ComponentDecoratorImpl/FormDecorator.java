package DecoratorMode.ComponentDecoratorImpl;

import DecoratorMode.BaseComponent;
import DecoratorMode.ComponentDecorator;

public class FormDecorator extends ComponentDecorator {
    public FormDecorator(BaseComponent component) {
        super(component);
    }
    @Override
    public void display(){
        setBlackBorder();
        super.display();
    }
    private void setBlackBorder(){
        System.out.println("给窗体加黑框");
    }
}
