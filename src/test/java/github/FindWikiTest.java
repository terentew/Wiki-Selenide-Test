package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindWikiTest {

    @Test
    void shouldFindWikiOnGitHub() {
        // открыть страничку гитхаб селинид
        open("https://github.com/selenide/selenide");
        // Выбрать Wiki
        // Выбрать Soft accertions
        $(byText("Wiki")).click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("Soft assertions")).click();
        //Проверить JUnit5
        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class"));
    }

    @Test
    void DragAndDrop() {
        // открыть страничку драг-н-дроп
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo("#column-b");
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
        // $("#column-a").dragAndDropTo("column-b");
    }

}
