package github;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PricingAndHoverTest {
    @BeforeEach
    void openGit(){
        //open github main page
        open("https://github.com/");
    }
    @Test
    void comparePlans() {
        //select Pricing menu
        $(byLinkText("Pricing")).click();
        //check that compare plans page is opened
        $(".h2-mktg").shouldHave(text("Get the complete developer platform."));
    }

    @Test
    void hoverTest(){
        //hover over Product
        $(".header-menu-wrapper").$(byText("Product")).hover();
        //select Actions from drop-down
        $(byText("Actions")).click();
        //check that Actions page contains text 'Automate your workflow'
        $(".h2-mktg").shouldHave(text("Automate your workflow"));
    }
}
