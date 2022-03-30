package ru.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import ru.gb.locators.LocatorService;
import ru.gb.locators.interfaces.FormsPageLocators;


public class FormsPage {

    private FormsPageLocators locator() {return LocatorService.FORMS_PAGE_LOCATORS;}

    @Step("Кликаем по кнопке 'Switch' в форме")
    public FormsPage clickSwitchButton() {
        Selenide.$(locator().switchButton()).click();
        return new FormsPage();
    }

    @Step("Проверяем текст")
    public FormsPage checkSwitchText(String text) {
        Selenide.$(locator().switchOffText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }
}
