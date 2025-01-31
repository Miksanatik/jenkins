package organisation;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    @Test
    @DisplayName("Simple test")
    public void test(){
        assertTrue(true);
    }
    @Test
    @DisplayName("Simple test 2")
    @AllureId("1")
    @Epic("Авторизация")
    @Feature("Логин")
    @Story("Пользователь может войти в систему")
    @Description("Проверка успешного логина с валидными данными")
    @Severity(SeverityLevel.CRITICAL)
    public void test2(){
        assertTrue(true);
    }
    @Test
    @DisplayName("Simple test 3")
    @AllureId("2")
    @Epic("Отправка сообщения")
    @Feature("Нажатие на кнопку")
    @Story("Пользователь может отправить сообщение на почту")
    @Description("Проверка успешной отправки сообщения")
    public void test3(){
        assertTrue(true);
    }

    @Test
    @DisplayName("Simple negative test")
    @AllureId("3")
    @Epic("Кредиты")
    @Feature("Заявка на кредит")
    @Story("Пользователь может отправить заяку на кредит")
    @Description("Проверка успешной продажи почки")
    public void ntest(){
        assertTrue(false);
    }
}
