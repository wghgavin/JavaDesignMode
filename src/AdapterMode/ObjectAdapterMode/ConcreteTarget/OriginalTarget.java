package AdapterMode.ObjectAdapterMode.ConcreteTarget;

import AdapterMode.ClassAdapterMode.Target;

public class OriginalTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有普通功能");
    }
}
