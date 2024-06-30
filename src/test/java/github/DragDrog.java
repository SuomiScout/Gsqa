package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragDrog {
    @BeforeAll
    static void before() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    @Test

    void DragandDrog() {
        open ("/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        actions().moveToElement($("#column-b")).clickAndHold().moveByOffset(-250, 0).release().perform();
        $("#column-a").shouldHave(text("A"));
        sleep(10000);
    }
}
