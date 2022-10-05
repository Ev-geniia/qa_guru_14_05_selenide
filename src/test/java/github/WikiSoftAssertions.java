package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class WikiSoftAssertions {
    @Test
    void wikiHasSoftAssertionsWithJUnit5() {
        //open selenide in github
        open("https://github.com/selenide/selenide");
        //open Wiki
        $("#wiki-tab").click();
        //check Pages list has SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $$(".js-wiki-pages-box").find(visible).shouldHave(text("SoftAssertions"));
        //open SoftAssertions
        $(byLinkText("Soft assertions")).click();
        //check SoftAssertions has example for JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
