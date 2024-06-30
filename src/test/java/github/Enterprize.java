package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Enterprize {

    @Test
    void Prizeenter () {
        open ("https://github.com");
        $(Selectors.byText("Solutions")).hover();
        $(Selectors.byText("Enterprise")).click();
        $("body").shouldHave(text("To build, scale, and deliver secure software."));
        sleep(10000);
    }
}

