package ru.gb.locators.IOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.MainPageLocators;

public class iOSMainPageLocators implements MainPageLocators {

    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }
    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By FormsButton() {
        return null;
    }

    @Override
    public By SwipeButton() {
        return null;
    }
}
