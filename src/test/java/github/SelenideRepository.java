package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SelenideRepository {
    @Test
    void shouldFindSelenideAsRepository() {
        //open github.com
        open("https://github.com/");
        //enter 'selenide' to search field and press Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        //click first link in results
        $$("ul.repo-list li").first().$("a").click();
        //check if header contains 'selenide/selenide'
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

    }
}
