package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test
    void solntcevShouldBeTheTopContributor () {
        //Configuration.browserSize="800*400";
        //открытьстраницу репозитория Selenide
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому аватару из блока Contibutors
        $(".BorderGrid").$(Selectors.byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        // в всплывающем окне есть текст Andrei Solntsev
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
