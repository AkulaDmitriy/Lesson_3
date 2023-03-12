package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.RegistrationResultModal;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    private SelenideElement lastNameInput = $("#lastName"),
            firstNameInput = $("#firstName"),
            emailInput = $("#userEmail"),
            genderValue = $("#gender-radio-1"),
            phoneNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbies-checkbox-1"),
            fileUpload = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            state = $("#state"),
            choseState = $("#react-select-3-option-0"),
            cityInput = $("#city"),
            choseCity = $("#react-select-4-option-0"),
            submitForm = $("#submit"),
            submitMsg = $("#example-modal-sizes-title-lg"),
            resultForm = $(".modal-body");

    public RegistrationPage openPage() {

        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage removeBanner() {

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {

        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {

        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {

        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender() {

        genderValue.sendKeys(" ");
        return this;
    }

    public RegistrationPage setPhoneNumber(String value) {

        phoneNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String value) {

        dateOfBirthInput.setValue("03 Aug 1985").pressEnter();
        return this;

    }

    public RegistrationPage setSubject(String value) {

        subjectInput.setValue(value).pressEnter();
        return this;

    }

    public RegistrationPage setHobbies() {

        hobbiesInput.sendKeys(" ");
        return this;

    }

    public RegistrationPage uploadFile(String value) {

        fileUpload.uploadFile(new File(value));
        return this;

    }

    public RegistrationPage setAddress(String value) {

        addressInput.setValue(value);
        return this;

    }

    public RegistrationPage setState() {

        state.click();
        return this;
    }

    public RegistrationPage setChoseState() {

        choseState.click();
        return this;
    }

    public RegistrationPage setCity() {

        cityInput.click();
        return this;
    }

    public RegistrationPage choseCity() {

        choseCity.click();
        return this;
    }

    public RegistrationPage submitForm() {

        submitForm.click();
        return this;
    }

    public RegistrationPage checkSubmitMsg(String value) {

        submitMsg.shouldHave(text(value));
        return this;
    }

    public RegistrationPage verifyResultModalAppears() {

        registrationResultModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {

        registrationResultModal.verifyResult(key, value);

        return this;
    }
}
