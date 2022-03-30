package ru.gb.locators;

import ru.gb.locators.Android.AndroidFormsPageLocators;
import ru.gb.locators.Android.AndroidSwipePageLocators;
import ru.gb.locators.IOS.iOSFormsPageLocators;
import ru.gb.locators.IOS.iOSLoginPageLocators;
import ru.gb.locators.IOS.iOSMainPageLocators;
import ru.gb.locators.Android.AndroidLoginPageLocators;
import ru.gb.locators.Android.AndroidMainPageLocators;
import ru.gb.locators.IOS.iOSSwipePageLocators;
import ru.gb.locators.interfaces.FormsPageLocators;
import ru.gb.locators.interfaces.LoginPageLocators;
import ru.gb.locators.interfaces.MainPageLocators;
import ru.gb.locators.interfaces.SwipePageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
                    .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
                    .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();
    public static final FormsPageLocators FORMS_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidFormsPageLocators() : new iOSFormsPageLocators();
    public static final SwipePageLocators SWIPE_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidSwipePageLocators() : new iOSSwipePageLocators();
}
