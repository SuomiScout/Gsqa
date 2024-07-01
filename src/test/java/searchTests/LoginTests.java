package searchTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {
        open("https://qa.guru/cms/system/login");

        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("qagurupassword");
        $(".btn-success").click();
        //$(".main-header__login").click();

        $(".btn-success").shouldHave(text("Неверный пароль"));
    }

//    @Test
//    void successfulLoginWithCommentsTest() {
////        Открыть форму авторизации
////        https://qa.guru/cms/system/login
////        Ввести адрес электронной почты
////        Ввести пароль
////        Нажать кнопку "Войти"
////        Нажать на кнопку "Личный кабинет"
////        Проверить успешную авторизацию
//
//        Configuration.holdBrowserOpen = true;
//        Configuration.browser = "firefox";
//        Configuration.browserSize = "1920x1080";
//
////        Открыть форму авторизации
//        open("https://qa.guru/cms/system/login");
//
////        Ввести адрес электронной почты
//        $("[name=email]").setValue("qagurubot@gmail.com");
////        Ввести пароль
//        $("[name=password]").setValue("qagurupassword");
////        Нажать кнопку "Войти"
//        $(".btn-success").click();
////        Нажать на кнопку "Личный кабинет"
//        $(".main-header__login").click();
//
////        Проверить успешную авторизацию
//        $(".logined-form").shouldHave(text("QA_GURU_BOT"));
//    }
//    }
}
