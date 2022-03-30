package ru.gb;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ScreenshotHelper extends BaseTest {

    @Test
    public void createScreen() {
        openApp();
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }
}
