package ru.gb.locators.IOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.LoginPageLocators;

public class iOSLoginPageLocators implements LoginPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return MobileBy.AccessibilityId("Please enter a valid email address");

    }
}

