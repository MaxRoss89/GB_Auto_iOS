package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.SwipePageLocators;

public class AndroidSwipePageLocators implements SwipePageLocators {


    @Override
    public By swipeHorizontalText() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");}

    @Override
    public By FullyButton() {
        return MobileBy.xpath ("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    }
}
