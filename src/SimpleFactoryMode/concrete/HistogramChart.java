package SimpleFactoryMode.concrete;

import SimpleFactoryMode.Chart;

/**
 * 柱状图
 */
public class HistogramChart implements Chart{
    @Override
    public void display() {
        System.out.println("显示柱状图");
    }

    @Override
    public void create() {
        System.out.println("创建柱状图");
    }
}
