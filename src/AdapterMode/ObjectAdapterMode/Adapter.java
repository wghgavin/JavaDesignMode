package AdapterMode.ObjectAdapterMode;

import AdapterMode.ObjectAdapterMode.ConcreteTarget.Adaptee1;

public class Adapter implements Target {
    private Adaptee1 adaptee;
    public Adapter(Adaptee1 adaptee){
         this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
