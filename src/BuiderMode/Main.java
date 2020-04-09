package BuiderMode;

import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream  in = Main.class.getClassLoader().getResourceAsStream("AppConfig.properties");
            Properties pro = new Properties();
            pro.load(in);
            String value = String.valueOf(pro.get("BuiderModeConfig"));
            Class myClass = Class.forName(value);
            Object instance = myClass.getDeclaredConstructor().newInstance();
            BuildController controller=null;
            Actor actor =null;
            if(instance instanceof Builder){
              Builder builder = (Builder)instance;
              controller = new BuildController(builder);
              actor = controller.construct();
              System.out.println(actor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
