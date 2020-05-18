package SimpleFactoryMode;

import SimpleFactoryMode.concrete.HistogramChart;
import SimpleFactoryMode.factory.ChartFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

/*
简单工厂模式:
工厂:提供生产具体产品方法
抽象产品:提供抽象产品的公共方法
具体产品:实现抽象产品的具体方法
例子:
开发一套图库表,有不同的外观，分别是柱状图,饼状图，折线图
 */
public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = ChartFactory.class.getClassLoader().getResourceAsStream("AppConfig.properties");
            Properties pro = new Properties();
            pro.load(is);
            String value= String.valueOf(pro.get("SimpleFacModeConfig"));
            Optional<Chart> chartOpt = ChartFactory.getChart(value);
            Chart chart = chartOpt.orElseGet(()->{
                System.out.println("无此实例存在");
                return  new Chart() {
                    @Override
                    public void display() {
                        System.out.println("未知实例");
                    }

                    @Override
                    public void create() {
                        System.out.println("创建失败");
                    }
                };
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
