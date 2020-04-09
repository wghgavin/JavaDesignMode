package AbstractFactoryMode;

import AbstractFactoryMode.AbstractFactory.SystemFactory;
import AbstractFactoryMode.AbstractProduct.Button;
import AbstractFactoryMode.AbstractProduct.TextBox;
import AbstractFactoryMode.ConcreteProduct.Linux.LinuxButton;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("d", "b", "a", "c", "a");
        Set<Map.Entry<Integer, String>> list = new HashSet<>();
        list.stream().min(Comparator.comparing(x -> x.getKey()));
        String path = Main.class.getClassLoader().getResource("AppConfig.properties").getPath();
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


