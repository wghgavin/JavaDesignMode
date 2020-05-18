package AdapterMode.ObjectAdapterMode;

import AdapterMode.ObjectAdapterMode.ConcreteTarget.Adaptee1;

/**
 * 对象适配器模式
 */
public class Main {
    public static void main(String[] args) {
        Target target =new Adapter(new Adaptee1());
        target.request();
    }
}
