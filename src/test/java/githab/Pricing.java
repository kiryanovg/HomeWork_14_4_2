package githab;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Pricing {

    @BeforeAll
    static void configBrowser() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void pricing() {
        open("https://github.com");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".font-mktg").shouldHave(text("Choose the plan that’s right for you."));
    }
}