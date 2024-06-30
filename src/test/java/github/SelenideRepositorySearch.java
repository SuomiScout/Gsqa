package github;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop () {
        //открыть страницу
        open("https://github.com/");
        //open("https://github.com/search?q=selenide&type=repositories");
        //ввести в поле поиска selenide и нажать Enter
        //$("[name=user_email]").setValue("selenide").pressEnter();
        //кликнуть на первый репозиторий из списка найденных
        $("div.mr-2").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        //$$("div.Box-sc-g0xbh4-0 div").first().$("a").click();
        $$("div.hDWxXB div").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        //$("a.Link__StyledLink-sc-14289xe-0").click();
        //$("span.Text-sc-17v1xeu-0").click();
        //проверка: заголок selenide/selenide2
        sleep(8000);



    }
}
