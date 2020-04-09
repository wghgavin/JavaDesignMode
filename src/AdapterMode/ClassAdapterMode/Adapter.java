package AdapterMode.ClassAdapterMode;

import AdapterMode.ClassAdapterMode.ConcreteTarget.Adaptee1;

/**
 * 适配器类，继承了被适配类，同时实现标准接口
 */
public class Adapter extends Adaptee1 implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
