package com.jbaxenom.laget.aao.core.actors;

import com.jbaxenom.laget.configuration.Configuration;
import com.jbaxenom.laget.webdriver.WebDriverBuilder;
import hu.meza.aao.Actor;
import io.appium.java_client.ios.IOSDriver;

/**
 * Created by jbaxenom on 2014-08-19.
 */
public abstract class IOSActor extends Actor implements MobileActor {

    private final ThreadLocal<IOSDriver> driver = new ThreadLocal<>();

    public IOSActor() {
        this.driver.set(initializeAppium());
    }

    public IOSDriver getDriver() {
        return this.driver.get();
    }

    public IOSDriver initializeAppium() {
        return (IOSDriver) new WebDriverBuilder()
                .withGridUrl(Configuration.getGridUrl())
                .withApp(Configuration.getAppPath())
                .buildMobile();
    }

}