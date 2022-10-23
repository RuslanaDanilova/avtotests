package ru.ok;

import org.junit.Test;
import ru.ok.page.FeedPage;
import ru.ok.page.LoginPage;

public class LoginTest {
    private static final String LOGIN = "technoPol16";
    private static final String PASSWORD = "technoPolis2022";

    @Test
    public void loginTest() {
        LoginPage ok = new LoginPage();
        ok.open();
        ok.check();

        FeedPage feed = ok.login(LOGIN,PASSWORD);
        feed.check();
    }

}