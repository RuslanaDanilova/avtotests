package ru.ok.page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FeedPage {
    private static final String NAME_FIELD = "//a[contains(@class, 'nav-side_i  __with-ic __with-new-icons') and contains(@data-l, 't,userPage')]";

    public String getName(){
        return $(byXpath(NAME_FIELD)).text();
    }

    public void check() {
        $(byXpath(NAME_FIELD)).shouldBe(Condition.visible);
    }
}
