package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.FormsPageLocators;

public class AndroidFormsPageLocators implements FormsPageLocators {

    @Override
    public By switchButton() {
        return MobileBy.xpath("//android.widget.Switch[@content-desc=\"switch\"]");
    }

    @Override
    public By switchOffText() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc=\"switch-text\"]");
    }
}
