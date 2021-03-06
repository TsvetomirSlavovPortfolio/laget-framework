package com.jbaxenom.laget.domain.examples.actions;

import com.jbaxenom.laget.domain.core.actions.MobileAction;
import com.jbaxenom.laget.interactions.webdriver.pages.examples.ExampleAndroidLoginPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriverException;

/**
 * @author jbaxenom
 */
public class ExampleAndroidAction extends MobileAction {

    private final String username;
    private final String password;

    private ExampleAndroidLoginPage loginPage;

    public ExampleAndroidAction(AndroidDriver driver, String username, String password) {
        super(driver);
        this.username = username;
        this.password = password;
    }

    @Override
    public void execute() throws WebDriverException {
        //driver.launchApp();
        loginPage = new ExampleAndroidLoginPage(driver);
        isSuccessful = loginPage.isLogoDisplayed() && loginPage.login(username, password).getLoggedUsername().equals(username);
    }

    public ExampleAndroidLoginPage mobilePage() {
        return loginPage;
    }

    @Override
    public ExampleAndroidAction copyOf() {
        return this;
    }

}
