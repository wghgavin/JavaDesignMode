package SimpleFactoryMode.factory;

import SimpleFactoryMode.Chart;
import SimpleFactoryMode.Main;

import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class ChartFactory {
    public static Optional<Chart> getChart(String charName){
        try {
            Class<?> clazz = Class.forName(charName);
            Object obj = clazz.getDeclaredConstructor().newInstance();
            if(obj instanceof Chart){
                Chart chart =(Chart)obj;
                return  Optional.of(chart);
            }
            else
                return Optional.empty();
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
