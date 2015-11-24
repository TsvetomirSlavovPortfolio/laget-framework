package com.jbaxenom.laget.aao.core.actors;

import com.jbaxenom.laget.configuration.Configuration;
import com.jbaxenom.laget.webdriver.WebDriverBuilder;
import hu.meza.aao.Actor;
import io.appium.java_client.AppiumDriver;

/**
 * Created by jbaxenom on 2014-08-19.
 */
public abstract class MobileBrowserActor extends Actor implements MobileActor {

    private final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public MobileBrowserActor() {
        this.driver.set(initializeAppium());
    }

    public AppiumDriver getDriver() {
        return this.driver.get();
    }

    public AppiumDriver initializeAppium() {
        return new WebDriverBuilder()
                .withGridUrl(Configuration.getGridUrl())
                .buildMobile();
    }

}