import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DemoqaTest {

    @BeforeAll
    static void beforeAll() {

        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void studentRegistrationFormTest() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");


        $("#firstName").setValue("Dima");

        $("#lastName").setValue("Akula");

        $("#userEmail").setValue("Dima_Akula@gmail.com");

        $("#gender-radio-1").sendKeys(" ");

        $("#userNumber").setValue("9999999999");

        $("#dateOfBirthInput").setValue("03 Aug 1985").pressEnter();

        $("#subjectsInput").setValue("Math").pressEnter();

        $("#hobbies-checkbox-1").sendKeys(" ");

        $("#uploadPicture").uploadFile(new File("src/test/resources/Img.png"));

        $("#currentAddress").setValue("Current Address");

        $("#state").click();
        $("#react-select-3-option-0").click();
        $("#city").click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(
                text("Dima"),
                text("Akula"),
                text("Dima_Akula@gmail.com")
        );


    }
}
