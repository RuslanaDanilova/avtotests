package ru.ok.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static final By LOGIN_FIELD = byXpath("//input[@id='field_email']");
    private static final By PASSWORD_FIELD = byXpath("//input[@id='field_password']");
    private static final By SUBMIT_BUTTON = byXpath("//*[@class='login-form-actions']/input[@type='submit']");


    public LoginPage open() {
        Selenide.open("https://ok.ru/");
        return this;
    }
    public FeedPage login(String login, String password) {

        $(LOGIN_FIELD).setValue(login);
        $(PASSWORD_FIELD).setValue(password);
        $(SUBMIT_BUTTON).click();

        return new FeedPage();
    }

    public void check(){
        $(LOGIN_FIELD).shouldBe(Condition.visible);
        $(PASSWORD_FIELD).shouldBe(Condition.visible);
        $(SUBMIT_BUTTON).shouldBe(Condition.visible);
    }
}
