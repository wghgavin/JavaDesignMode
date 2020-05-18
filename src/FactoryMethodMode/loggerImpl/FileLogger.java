package FactoryMethodMode.loggerImpl;

import FactoryMethodMode.ILogger;

public class FileLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
