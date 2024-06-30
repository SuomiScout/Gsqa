package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSoftAssertions {
    @Test

    void shouldFindSortAssertions () {
        //Откройте страницу Selenide в Github
        open ("https://github.com/selenide/selenide");
        //wiki-tab //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $(".Box").shouldHave(text("SoftAssertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".Box").$(Selectors.byText("SoftAssertions")).click();
        $("body").shouldHave(text("Using JUnit5 extend test class"));
//Using JUnit7 extend test class
        sleep(10000);
    }
}
