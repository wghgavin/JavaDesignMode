package FactoryMethodMode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂方法模式
 * 组成:
 * 抽象工厂:提供创建产品方法
 * 具体工厂:提供创建具体产品方法
 * 抽象产品:提供产品基本方法
 * 具体产品：实现产品基本方法
 * 例子：实现日志记录器，通过文件记录或数据库记录，用户通过修改配置灵活更换日志记录
 */
public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = Main.class.getClassLoader().getResourceAsStream("AppConfig.properties");
            Properties pro = new Properties();
            pro.load(is);
            String className =String.valueOf(pro.get("FactoryMethodMode.factoryImpl.DbLoggerFactory"));
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getDeclaredConstructor().newInstance();
            if(obj instanceof  ILoggerFactory){
                ILoggerFactory factory = (ILoggerFactory)obj;
                ILogger logger = factory.createLogger();
                logger.writeLog();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
