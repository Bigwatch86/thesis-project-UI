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

    @Test
    @Owner("igor.glazov")
    @Feature("Главная страница Citilink")
    @DisplayName("Проверка загрузки тела нижнего колонтитула")
    @Severity(SeverityLevel.BLOCKER)
    public void footerBodyLoading(){
        step("Проверяем загрузку тела нижнего колонтитула", () -> {
            mainPage.checkFooterBody();
            step("Контакты", () -> {
                mainPage.checkFooterContactHeading("Контакты");
                mainPage.checkFooterContactAddress("Адреса магазинов");
                mainPage.checkFooterContactButton("Задать вопрос");
            });
            step("Меню нижнего колонтитула", () -> {
                mainPage.checkFooterMenu("Журнал");
                mainPage.checkFooterMenu("Акции");
                mainPage.checkFooterMenu("Сервисные центры");
                mainPage.checkFooterMenu("Услуги");
                mainPage.checkFooterMenu("Корпоративным клиентам");
                mainPage.checkFooterMenu("Обзоры");
                mainPage.checkFooterMenu("Барахолка");
                mainPage.checkFooterMenu("Форум");
                mainPage.checkFooterMenu("Конфигуратор");
                mainPage.checkFooterMenu("Подбор расходных материало");
                mainPage.checkFooterMenu("Ситилинк");
                mainPage.checkFooterMenu("Новости");
                mainPage.checkFooterMenu("Клуб Ситилинк");
                mainPage.checkFooterMenu("Вакансии");
            });
            step("Копирайт", () ->
                mainPage.checkFooter("© Ситилинк, 2008–2022"));
            step("Платёжные системы и партнёры", () -> {
                mainPage.checkPaymentIconWorldPay();
                mainPage.checkPaymentIconMastercardPay();
                mainPage.checkPaymentIconVisaPay();
                mainPage.checkPaymentIconUnionPay();
                mainPage.checkPaymentIconYandex();
                mainPage.checkPaymentIconAkit();
                mainPage.checkPaymentIconEaist();
                mainPage.checkPaymentIconRtrs();
            });
            step("Политика обработки персональных данных", () ->
                mainPage.checkFooterGdpr());
        });
    }
}
