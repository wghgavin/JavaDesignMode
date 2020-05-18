package AbstractFactoryMode;

import AbstractFactoryMode.AbstractFactory.SystemFactory;
import AbstractFactoryMode.AbstractProduct.Button;
import AbstractFactoryMode.AbstractProduct.TextBox;
import AbstractFactoryMode.ConcreteProduct.Linux.LinuxButton;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Function;
/*
抽象工厂模式包括:
1.抽象工厂:提供生产具体产品方法
2.具体工厂：继承抽象工厂，实现具体生产产品方法
3.抽象产品:提供抽象产品的方法
4.具体产品:实现具体产品展示和实现的方法
具体实例:
实现linux,unix,windows系统下的不同button和textbox控件的展示
 */
public class Main {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("d", "b", "a", "c", "a");
        Set<Map.Entry<Integer, String>> list = new HashSet<>();
        list.stream().min(Comparator.comparing(x -> x.getKey()));
        String path = Main.class.getClassLoader().getResource("AppConfig.properties").getPath();
        //以上都只是测试其他功能，以下是重点
        Properties pro = new Properties();
        String childClassName ="";
        try {
            InputStream in = Main.class.getResourceAsStream("/AppConfig.properties");
            pro.load(in);
            childClassName = String.valueOf(pro.get("AbstractFacConfig"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class myclass = Class.forName(childClassName);
            Object obj = myclass.getDeclaredConstructor().newInstance();
            if (obj instanceof SystemFactory) {
                SystemFactory fac = (SystemFactory) obj;
                Button button = fac.createButton();
                button.displayButton();
                TextBox textBox = fac.createTextBox();
                textBox.displayTestBox();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


