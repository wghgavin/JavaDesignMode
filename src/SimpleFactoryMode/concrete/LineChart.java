package SimpleFactoryMode.concrete;

import SimpleFactoryMode.Chart;

public class LineChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示折线图");
    }

    @Override
    public void create() {
        System.out.println("创建折线图");
    }
}
