package DecoratorMode;

public class ComponentDecorator extends BaseComponent{
    private BaseComponent component;
    public ComponentDecorator(BaseComponent component){
        this.component=component;
    }
    @Override
    public void display() {
      component.display();
    }
}
