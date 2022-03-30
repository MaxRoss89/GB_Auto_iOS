package ru.gb.tests.swipe;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckSwipe extends BaseTest {
    public static final String Text = "Swipe horizontal";

    @Test
    @Description("Проверяем наличие заголовка.")
    public void CheckSwipeText() {
        openApp()
                .clickSwipeMenuButton()
                .checkSwipeText(Text);
    }

    @Test
    @Description("Клик 'Fully Open Source'")
    public void CheckFirstLink() {
        openApp()
                .clickSwipeMenuButton()
                .clickFullyButton();

    }
}