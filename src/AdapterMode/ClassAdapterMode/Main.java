package AdapterMode.ClassAdapterMode;

import AdapterMode.ClassAdapterMode.Adapter;
import AdapterMode.ClassAdapterMode.ConcreteTarget.Adaptee1;
import AdapterMode.ClassAdapterMode.ConcreteTarget.OriginalTarget;
import AdapterMode.ClassAdapterMode.Target;

/**
 * 类适配器模式
 */
public class Main {
    public static void main(String[] args) {
        //原始功能类
        Target target = new OriginalTarget();
        target.request();
        //特殊功能类
        Target adapter = new Adapter();
        adapter.request();
    }
}
