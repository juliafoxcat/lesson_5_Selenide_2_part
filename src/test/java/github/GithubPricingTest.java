package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubPricingTest {


    @Test
    void findPriceOption() {
        open("https://github.com/");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("div h1").shouldHave(text("Choose the plan that’s right for you"));
    }
}
