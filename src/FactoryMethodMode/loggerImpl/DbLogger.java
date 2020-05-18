package FactoryMethodMode.loggerImpl;

import FactoryMethodMode.ILogger;

public class DbLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
