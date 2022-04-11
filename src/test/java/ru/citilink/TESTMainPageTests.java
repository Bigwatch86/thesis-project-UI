package ru.citilink;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.citilink.pages.TESTMainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@DisplayName("Тесты для проверки содержимого главной страницы citilink.ru")
public class TESTMainPageTests extends TestBase{
    TESTMainPage mainPage = new TESTMainPage();

    @Disabled
    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки верхней части заголовка и её содержимого")
    @Severity(SeverityLevel.BLOCKER)
    public void headerTopLoading() {
        step("Проверяем загрузку верхней части заголовка и её содержимого", () -> {
            mainPage.checkTop();
            step("Лого", () ->
                mainPage.checkLogo());
            mainPage.checkInfoBlock();
            step("Город", () ->
                mainPage.checkMainHeaderCity());
            step("Телефон", () ->
                mainPage.checkMainHeaderPhone());
            step("Журнал", () ->
                mainPage.checkMainMenuMagazine("Журнал"));
            step("Акции", () ->
                mainPage.checkMainMenuSale("Акции"));
            step("Ситилинк.Бизнес", () ->
                mainPage.checkMainMenuBusiness("Ситилинк.Бизнес"));
            step("Конфигуратор", () ->
                mainPage.checkMainMenuConfig("Конфигуратор"));
            step("Доставка", () ->
                mainPage.checkMainMenuDelivery("Доставка"));
            step("Магазины", () ->
                mainPage.checkMainMenuShops("Магазины"));
            step("Обратная связь", () ->
                mainPage.checkMainMenuFeedback("Обратная связь"));
        });
    }
    @Disabled
    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки нижней части заголовка и её содержимого")
    @Severity(SeverityLevel.BLOCKER)
    public void headerBottomLoading() {
        step("Проверяем загрузку нижней части заголовка и её содержимого", () -> {
            mainPage.checkMainHeaderInnerBottom();
            step("Каталог", () ->
                mainPage.checkMainHeaderCatalog());
            mainPage.checkMainHeaderActionsBlock();
            step("Поле поиска", () ->
                mainPage.checkMainHeaderSearch());
            mainPage.checkHeaderMenu();
            step("Войти", () ->
                mainPage.checkAuthPopup());
            step("Избранное", () ->
               mainPage.checkWishlist());
            step("Сравнение", () ->
                mainPage.checkCompare());
            step("Корзина", () ->
                mainPage.checkBasket());
        });
    }
    @Disabled
    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки нижнего колонтитула")
    @Severity(SeverityLevel.BLOCKER)
    public void footerLoading() {
        step("Проверяем загрузку нижнего колонтитула", () -> {
            mainPage.checkJsFooter();
            step("Подписка по почте", () -> {
                mainPage.checkMailSubscribtion("Хочу быть в курсе акций и новинок");
                mainPage.checkSubscribeEmailButton("Подписаться");
            });
            step("Уведомления в браузере", () -> {
                mainPage.checkPushTitle("Включить уведомления в браузере");
                mainPage.checkSubscribePush("Новости, акции и все самые важные события для вас!");
                mainPage.checkSubscribePushButton("Включить");
            });
        });
    }
    @Disabled
    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки тела нижнего колонтитула")
    @Severity(SeverityLevel.BLOCKER)
    public void footerBodyLoading(){
        step("Проверяем загрузку тела нижнего колонтитула", () -> {
            $(".Footer__body").shouldBe(visible);
            step("Контакты", () -> {
                $(".Footer__contact").$(".Heading").shouldBe(visible).shouldHave(text("Контакты"));
                $(".Footer__contact").$(".Footer__contact-address").shouldBe(visible).shouldHave(text("Адреса магазинов"));
                $(".Footer__contact").$(".Footer__contact-button").shouldBe(visible).shouldHave(text("Задать вопрос"));
            });
            step("Меню нижнего колонтитула", () -> {
                $(".FooterMenu__menu").shouldBe(visible).shouldBe(text("Журнал"), text("Акции"), text("Сервисные центры"),
                        text("Услуги"), text("Корпоративным клиентам"), text("Обзоры"), text("Барахолка"), text("Форум"),
                        text("Конфигуратор"), text("Подбор расходных материалов"), text("Ситилинк"), text("Новости"),
                        text("Клуб Ситилинк"), text("Вакансии"));
            });
            step("Копирайт", () ->
                $(".Footer__citilink").shouldBe(visible).shouldBe(text("© Ситилинк, 2008–2022")));
            step("Платёжные системы и партнёры", () -> {
                $(".PaymentIcons__payment-icon_world-pay").shouldBe(visible);
                $(".PaymentIcons__payment-icon_mastercard_pay").shouldBe(visible);
                $(".PaymentIcons__payment-icon_visa_pay").shouldBe(visible);
                $(".PaymentIcons__payment-icon_union_pay").shouldBe(visible);
                $(".PaymentIcons__payment-icon_yandex_market").shouldBe(visible);
                $(".PaymentIcons__payment-icon_akit").shouldBe(visible);
                $(".PaymentIcons__payment-icon_eaist").shouldBe(visible);
                $(".PaymentIcons__payment-icon_rtrs").shouldBe(visible);
            });
            step("Политика обработки персональных данных", () ->
                $(".Footer__gdpr").shouldBe(visible));
        });
    }
}
