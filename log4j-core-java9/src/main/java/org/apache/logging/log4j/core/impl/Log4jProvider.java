package org.apache.logging.log4j.core.impl;

import org.apache.logging.log4j.spi.Provider;

import java.util.Properties;

public class Log4jProvider extends Provider {
    public Log4jProvider() {
        super(new Properties(), null, ClassLoader.getSystemClassLoader());
    }
}
