package ru.citilink.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TESTMainPage {
    SelenideElement
            MainHeaderLogo = $(".MainHeader__logo"),
            MainHeaderInfoBlock = $(".MainHeader__info-block"),
            MainHeaderInnerTop = $(".MainHeader__inner_top"),
            MainHeaderCity = $(".MainHeader__city"),
            MainHeaderPhone = $(".MainHeader__phone"),
            MainMenuMagazine = $(".MainMenu__link a"),
            MainMenuSale = $(".MainMenu__link a").sibling(0),
            MainMenuBusiness = $(".MainMenu__link a").sibling(1),
            MainMenuConfig = $(".MainMenu__link a").sibling(2),
            MainMenuDelivery = $(".MainMenu__link a").sibling(3),
            MainMenuShops = $(".MainMenu__link a").sibling(4),
            MainMenuFeedback = $(".MainMenu__link a").sibling(5),
            MainHeaderInnerBottom = $(".MainHeader__inner_bottom"),
            MainHeaderCatalog = $(".MainHeader__catalog"),
            MainHeaderActionsBlock = $(".MainHeader__actions-block"),
            MainHeaderSearch = $(".MainHeader__search"),
            HeaderMenu = $(".HeaderMenu"),
            AuthPopup = $(".AuthPopup"),
            Wishlist = $("[data-name=\"wishlist\"]"),
            Compare = $("[data-name=\"compare\"]"),
            Basket = $("[data-name=\"basket\"]"),
            JsFooter = $(".js--Footer"),
            SubscribeTitleEmail = $(".Subscribe__title_email"),
            SubscribeEmailInput = $(".Subscribe__email").$(".Subscribe__input"),
            SubscribeEmailButton = $(".Subscribe__email").$(".Subscribe__button"),
            SubscribeTitlePush = $(".Subscribe__title_push"),
            SubscribePush = $(".Subscribe__push").$(".Subscribe__input-block"),
            SubscribePushButton = $(".Subscribe__push").$(".Subscribe__button-push"),
            FooterContact = $(".Footer__contact");

    public void checkLogo() {
        MainHeaderLogo.shouldBe(visible);
    }
    public void checkInfoBlock() {
        MainHeaderInfoBlock.shouldBe(visible);
    }

    public void checkTop() {
        MainHeaderInnerTop.shouldBe(visible);
    }

    public void checkMainHeaderCity() {
        MainHeaderCity.shouldBe(visible);
    }

    public void checkMainHeaderPhone() {
        MainHeaderPhone.shouldBe(visible);
    }

    public void checkMainMenuMagazine(String value) {
        MainMenuMagazine.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainMenuSale(String value) {
        MainMenuSale.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainMenuBusiness(String value) {
        MainMenuBusiness.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainMenuConfig(String value) {
        MainMenuConfig.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainMenuDelivery(String value) {
        MainMenuDelivery.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainMenuShops(String value) {
        MainMenuShops.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainMenuFeedback(String value) {
        MainMenuFeedback.shouldBe(visible).shouldHave(text(value));
    }

    public void checkMainHeaderInnerBottom() {
        MainHeaderInnerBottom.shouldBe(visible);
    }
    public void checkMainHeaderCatalog() {
        MainHeaderCatalog.shouldBe(visible);
    }
    public void checkMainHeaderActionsBlock() {
        MainHeaderActionsBlock.shouldBe(visible);
    }
    public void checkMainHeaderSearch() {
        MainHeaderSearch.shouldBe(visible);
    }
    public void checkHeaderMenu() {
        HeaderMenu.shouldBe(visible);
    }
    public void checkAuthPopup() {
        AuthPopup.shouldBe(visible);
    }
    public void checkWishlist() {
        Wishlist.shouldBe(visible);
    }
    public void checkCompare() {
        Compare.shouldBe(visible);
    }
    public void checkBasket() {
        Basket.shouldBe(visible);
    }
    public void checkJsFooter() {
        JsFooter.shouldBe(visible);
    }
    public void checkMailSubscribtion(String title) {
        SubscribeTitleEmail.shouldBe(visible).shouldHave(text(title));
        SubscribeEmailInput.shouldBe(visible);
    }
    public void checkSubscribeEmailButton(String value) {
        SubscribeEmailButton.shouldBe(visible).shouldHave(text(value));
    }
    public void checkSubscribePush(String value) {
        SubscribePush.shouldBe(visible).shouldHave(text(value));
    }
    public void checkSubscribePushButton(String value) {
        SubscribePushButton.shouldBe(visible).shouldHave(text(value));
    }

    public void checkPushTitle(String title) {
        SubscribeTitlePush.shouldBe(visible).shouldHave(text(title));
    }
}
