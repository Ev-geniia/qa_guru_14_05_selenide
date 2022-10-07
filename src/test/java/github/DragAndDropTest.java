package github;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @BeforeEach
    void openHerokuapp(){
        //open herokuapp, drag and drop page
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }
    @Test
    void selenideActions(){
        //move rectangle A to position B with actions
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
         //check that the rectangles were moved
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
    @Test
    void selenideDragAndDrop(){
        //move rectangle A to position B with dragAndDrop
        $("#column-a").dragAndDropTo("#column-b");
        //check that the rectangles were moved
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }
}
