package FactoryMethodMode;

import FactoryMethodMode.loggerImpl.DbLogger;

public interface ILoggerFactory {
    ILogger createLogger();
}
