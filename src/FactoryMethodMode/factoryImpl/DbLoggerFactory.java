package FactoryMethodMode.factoryImpl;

import FactoryMethodMode.ILogger;
import FactoryMethodMode.ILoggerFactory;
import FactoryMethodMode.loggerImpl.DbLogger;

public class DbLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new DbLogger();
    }
}
