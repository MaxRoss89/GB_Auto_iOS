package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.MainPageLocators;


public class AndroidMainPageLocators implements MainPageLocators {

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
        return MobileBy.AccessibilityId("Forms");
    }

    @Override
    public By SwipeButton() {
        return MobileBy.AccessibilityId("Swipe");
    }
}
