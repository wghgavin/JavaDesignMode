package DecoratorMode;

import DecoratorMode.ComponentDecoratorImpl.FormDecorator;
import DecoratorMode.ComponentImpl.Form;

/**
 * 装饰模式是一种用于代替继承的技术，通过一种无须定义子类的方式给对象动态增加职责.降低系统耦合度
 * 包括以下几种组成:
 * Component(抽象构建)：是具体构建和抽象装饰类的共同父类
 * ConcreteComponent(具体构建):抽象构建类子类，实现了抽象构建类的方法
 * Decorator(抽象装饰类):抽象构建的子类,可以通过子类国战具体构建的方法
 * ConcreteDecorator(具体装饰类):抽象装饰类的子类,定义新行为
 * 例子：开发图形界面构件库:
 * 使用构件库时，客户要求制定特殊的显示效果，如带滚动条的窗体，带黑色边框的文本框,既带黑色边框又带滚动条的列表框等
 */
public class Main {
    public static void main(String[] args) {
        BaseComponent component,componentDecorator;
        component = new Form();
        componentDecorator = new FormDecorator(component);
        componentDecorator.display();
    }
}
