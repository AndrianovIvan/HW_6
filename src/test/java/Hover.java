import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Hover {
    @BeforeAll
    static void beforeAll (){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void hoverTest () {
        open("https://github.com");
        $$(".HeaderMenu-item").get(1).shouldHave(text("Solutions")).hover();
        $("html").$(byText("Enterprise")).click();
        $(".enterprise-hero-grid").shouldHave(text("The AI-powered\n" +
                "developer platform."));
    }
}
