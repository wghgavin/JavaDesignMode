package SimpleFactoryMode.concrete;

import SimpleFactoryMode.Chart;

public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }

    @Override
    public void create() {
        System.out.println("显示饼状图");
    }
}
