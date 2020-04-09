package AdapterMode.ClassAdapterMode.ConcreteTarget;

import AdapterMode.ClassAdapterMode.Target;

/**
 * 普通目标类，只提供普通功能
 */
public class OriginalTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有普通功能");
    }
}
