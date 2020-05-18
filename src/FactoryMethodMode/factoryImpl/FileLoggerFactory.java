package FactoryMethodMode.factoryImpl;

import FactoryMethodMode.ILogger;
import FactoryMethodMode.ILoggerFactory;
import FactoryMethodMode.loggerImpl.FileLogger;

public class FileLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }
}
